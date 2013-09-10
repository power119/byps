﻿using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using com.wilutions.byps;
using com.wilutions.byps.test.api;
using com.wilutions.byps.test.api.remote;
using System.IO;
using System.Text;
using System.Collections.Generic;
using System.Threading;

namespace bypstest
{
    [TestClass]
    public class TestRemoteStreams
    {
        Log log = LogFactory.getLog(typeof(TestRemoteStreams));
        BClient_Testser client;
        RemoteStreams remote;

        [TestInitialize]
        public void setUp()
        {
            client = TestUtilsHttp.createClient();
            remote = client.RemoteStreams;
        }

        [TestCleanup]
        public void tearDown()
        {
            client.done();
        }

        class MyContentStreamChunked : BContentStreamWrapper
        {
            public MyContentStreamChunked(Stream innerStream)
                : base(innerStream)
            {
            }

            public override String ContentType
            {
                get
                {
                    return "application/octet-stream";
                }
            }

            public override long ContentLength
            {
                get
                {
                    return -1L;
                }
            }

        }

        [TestMethod]
        public void testRemoteStreamsOneStreamChunked()
        {
            log.info("testRemoteStreamsOneStreamChunked(");
            String str = "hello";
            Stream istrm = new MyContentStreamChunked(new MemoryStream(Encoding.ASCII.GetBytes(str)));
            remote.SetImage(istrm);
            Stream istrmR = remote.GetImage();
            ByteBuffer buf = BWire.bufferFromStream(istrmR, false);
            String strR = Encoding.ASCII.GetString(buf.array(), buf.position(), buf.remaining());
            TestUtils.assertEquals(log, "stream", str, strR);
            log.info(")testRemoteStreamsOneStreamChunked");
        }

        [TestMethod]
        public void testRemoteStreamsOneStreamNotChunked()
        {
            log.info("testRemoteStreamsOneStreamNotChunked(");
            String str = "hello";
            Stream istrm = new MemoryStream(Encoding.ASCII.GetBytes(str));
            remote.SetImage(istrm);
            Stream istrmR = remote.GetImage();
            ByteBuffer buf = BWire.bufferFromStream(istrmR, false);
            String strR = Encoding.ASCII.GetString(buf.array(), buf.position(), buf.remaining());
            TestUtils.assertEquals(log, "stream", str, strR);
            log.info(")testRemoteStreamsOneStreamNotChunked");
        }

        [TestMethod]
	    public void testRemoteStreamsManyStreams() {
		    log.info("testRemoteStreamsOneStreams(");
            int nbOfStreams = 10;

            for (int i = 0; i < 1000; i++)
            {
                internalTestRemoteStreamsManyStreams(nbOfStreams);
            }

		    log.info(")testRemoteStreamsOneStreams");
	    }

        private void internalTestRemoteStreamsManyStreams(int nbOfStreams)
        {
            IDictionary<int, Stream> streams = new Dictionary<int, Stream>();
            for (int i = 0; i < nbOfStreams; i++)
            {
                String str = "hello-" + i;
                Stream istrm = new MemoryStream(Encoding.ASCII.GetBytes(str));
                streams[i] = istrm;
            }
            remote.SetImages(streams, -1);
            Dictionary<int, Stream> istrmsR = remote.GetImages();

            TestUtils.assertEquals(log, "streams", streams, istrmsR); // Does not compare streams.
            for (int i = 0; i < nbOfStreams; i++)
            {
                Stream istrmR = istrmsR[i];
                ByteBuffer buf = BWire.bufferFromStream(istrmR, false);
                String strR = Encoding.ASCII.GetString(buf.array(), buf.position(), buf.remaining());
                TestUtils.assertEquals(log, "stream", "hello-" + i, strR);
            }
        }

        private class MyInputStream : BContentStream
        {
            private Log log = LogFactory.getLog(typeof(MyInputStream));
            readonly byte[] buf;
            int idx;
		    public bool isClosed;
            public bool throwEx;
            public bool throwError;
		
		    public MyInputStream(byte[] buf, bool throwEx, bool throwError)
            {
                this.buf = buf;
                this.throwEx = throwEx;
                this.throwError = throwError;
		    }
		
		    public override void Close() {
			    isClosed = true;
                base.Close();
		    }

            public override long ContentLength
            {
                get
                {
                    return buf.Length;
                }
            }

            public override int Read(byte[] buffer, int offset, int count)
            {
                if (log.isDebugEnabled()) log.debug("Read(offs=" + offset + ", count=" + count);

                int ret = 0;
                if (throwEx)
                {
                    throw new IOException("Test Exception");
                }
                if (throwError)
                {
                    throw new InvalidOperationException("Test Error");
                }

                if (log.isDebugEnabled()) log.debug("idx=" + idx + ", buf.Length=" + buf.Length);
                if (idx < buf.Length)
                {
                    int i = 0;
                    for (; i < count && i + idx < buf.Length; i++)
                    {
                        buffer[i + offset] = buf[i + idx];
                    }
                    idx += i;
                    if (log.isDebugEnabled()) log.debug("idx=" + idx);
                    ret = i;
                }

                if (log.isDebugEnabled()) log.debug(")Read=" + ret);
                return ret;
            }

            public override int ReadByte()
            {
                if (throwEx)
                {
                    throw new IOException("Test Exception");
                }
                if (throwError)
                {
                    throw new InvalidOperationException("Test Error");
                }

                if (idx < buf.Length)
                {
                    return buf[idx++];
                }

                return 0;
            }

            public override bool CanRead
            {
                get { return true; }
            }

            public override bool CanSeek
            {
                get { return false; }
            }

            public override bool CanWrite
            {
                get { return false; }
            }

            public override void Flush()
            {
            }

            public override long Length
            {
                get { throw new NotImplementedException(); }
            }

            public override long Position
            {
                get
                {
                    throw new NotImplementedException();
                }
                set
                {
                    throw new NotImplementedException();
                }
            }

            public override long Seek(long offset, SeekOrigin origin)
            {
                throw new NotImplementedException();
            }

            public override void SetLength(long value)
            {
                throw new NotImplementedException();
            }

            public override void Write(byte[] buffer, int offset, int count)
            {
                throw new NotImplementedException();
            }
        }

	    [TestMethod]
	    public void testRemoteStreamsCloseStreamAfterSend() {
		    log.info("testRemoteStreamsCloseStreamAfterSend(");

            IDictionary<int, Stream> streams = new Dictionary<int, Stream>();
            for (int i = 0; i < 10; i++)
            {
                String str = "hello-" + i;
                Stream istrm = new MyInputStream(Encoding.ASCII.GetBytes(str), false, false);
                streams[i] = istrm;
            }
            remote.SetImages(streams, 5);
		
		    for (int i = 0; i < 10; i++) {
			    MyInputStream istrm = (MyInputStream)streams[i];
                TestUtils.assertEquals(log, "InputStream.isClosed", true, istrm.isClosed);
            }
	
		    log.info(")testRemoteStreamsCloseStreamAfterSend");
	    }


        [TestMethod]
        public void testRemoteStreamsThrowExceptionOnRead() {
		    log.info("testRemoteStreamsThrowExceptionOnRead(");
		
		    internalTestThrowExOnRead(true, false);
		    internalTestThrowExOnRead(false, true);
	
		    log.info(")testRemoteStreamsThrowExceptionOnRead");

	    }

	    private void internalTestThrowExOnRead(bool throwEx, bool throwError) {
		    log.info("internalTestThrowExOnRead(throwEx=" + throwEx + ", throwError=" + throwError);

            IDictionary<int, Stream> streams = new Dictionary<int, Stream>();
            for (int i = 0; i < 3; i++)
            {
                String str = "hello-" + i;
                Stream istrm = new MyInputStream(Encoding.ASCII.GetBytes(str), i == 1 && throwEx, i == 1 && throwError);
                streams[i] = istrm;
            }
		
		    // An exception is thrown in HWireClient.
		    try {
			    log.info("setImages...");
			    remote.SetImages(streams, -1);
			    Assert.Fail("Exception expected");
		    }
		    catch (BException e) {
			    log.info("setImages ex=" + e + ", OK");
			    String expectedMessage = throwEx ? "Test Exception" : "Test Error";
                String expectedDetails = throwEx ? "System.IO.IOException: Test Exception" : "System.InvalidOperationException: Test Error";
                TestUtils.assertEquals(log, "Exception Code", BExceptionC.IOERROR, e.Code);
                TestUtils.assertEquals(log, "Exception Message", expectedMessage, e.Message);
                String readDetails = e.Details.Substring(0, expectedDetails.Length);
                TestUtils.assertEquals(log, "Exception Details", expectedDetails, readDetails);
            }
		
		    {
			    log.info("read streams");
                IDictionary<int, Stream> istrmsR = remote.GetImages();
                for (int i = 0; i < istrmsR.Count; i++)
                {
                    Stream istrmR = istrmsR[i];
                    ByteBuffer buf = BWire.bufferFromStream(istrmR, false);
                    String strR = Encoding.ASCII.GetString(buf.array(), buf.position(), buf.remaining());
                    log.info("strR=" + strR);
                }
		    }
		
		    // All streams must have been closed
		    log.info("streams must be closed");
		    for (int i = 0; i < streams.Count; i++) {
			    MyInputStream istrm = (MyInputStream)streams[i];
			    TestUtils.assertEquals(log, "InputStream.isClosed", true, istrm.isClosed);
		    }
		
		    log.info(")internalTestThrowExOnRead");
	    }

        [TestMethod]
        public void testRemoteStreamsLargeStream()
        {
            if (!TestUtils.TEST_LARGE_STREAMS) return;
            log.info("testRemoteStreamsLargeStream(");

            long nbOfBytes = 0x100000000L;

            log.info("start upload");
            Stream istrm = new TestUtils.MyContentStream(nbOfBytes);
            remote.SetImage(istrm);

            log.info("start download");
            Stream istrmR = remote.GetImage();

            log.info("compare streams");
            istrm = new TestUtils.MyContentStream(nbOfBytes);
            TestUtils.assertEquals(log, "", istrm, istrmR);

            remote.SetImage(null);
            TestUtils.checkTempDirEmpty(client);

            log.info(")testRemoteStreamsLargeStream");
        }


    }
}
