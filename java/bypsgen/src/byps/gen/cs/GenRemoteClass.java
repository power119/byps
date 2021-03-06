package byps.gen.cs;
/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.gen.api.GeneratorException;
import byps.gen.api.MethodInfo;
import byps.gen.api.RemoteInfo;
import byps.gen.utils.CodePrinter;

class GenRemoteClass {
	
	static Log log = LogFactory.getLog(GenRemoteClass.class);
	
	private final static String IMPL_SUFFIX = "";
	
	static void generate(PrintContext pctxt, RemoteInfo rinfo) throws IOException {
		//log.debug(GeneratorJ.class.getName(), "generate");
	  if (rinfo != null) {
  		log.info("generate " + rinfo.qname);
  		CodePrinter pr = pctxt.getPrinterForApiClass(rinfo, IMPL_SUFFIX, false);
  		new GenRemoteClass(pctxt, rinfo,  pr).generate();
  		pr.close();
	  }
		//log.debug(GeneratorJ.class.getName(), "generate");
	}
	
	protected GenRemoteClass(PrintContext pctxt, RemoteInfo rinfo, CodePrinter pr) {
		this.rinfo = rinfo;
		this.pr = pr;
		this.interfaceName = IMPL_SUFFIX + rinfo.name;
		this.pctxt = pctxt;
	}
	
  private void printMethod(MethodInfo methodInfo) throws IOException {
    //log.debug(GeneratorJ.class.getName(), "printMember");
    
    pctxt.printComments(pr, methodInfo.comments);
    
    CodePrinter mpr = pctxt.printDeclareMethod(pr, rinfo, methodInfo);
    mpr.println(";");
    
    //log.debug(GeneratorJ.class.getName(), "printMember");
  }
  
  private void printMethodAsync(MethodInfo methodInfo) throws IOException {
    pctxt.printComments(pr, methodInfo.comments);
    
    CodePrinter mpr = pctxt.printDeclareMethodAsync(pr, rinfo, methodInfo);
    mpr.println(";");
  }
  
	private void printMethodDelegate(MethodInfo methodInfo) throws IOException {
		//log.debug(GeneratorJ.class.getName(), "printMethodAsync");
		
		CodePrinter mpr = pctxt.printDeclareMethodDelegate(pr, rinfo, methodInfo);
		mpr.println(";");
		
		//log.debug(GeneratorJ.class.getName(), "printMethodAsync");
	}

	private void printMethodBeginAsync(MethodInfo methodInfo) throws IOException {
		CodePrinter mpr = pctxt.printDeclareMethodBeginAsync(pr, rinfo, methodInfo);
		mpr.println(";");
	}
	
	private void printMethodEndAsync(MethodInfo methodInfo) throws IOException {
		CodePrinter mpr = pctxt.printDeclareMethodEndAsync(pr, rinfo, methodInfo);
		mpr.println(";");
	}
	
	protected void generate() throws IOException {
		//log.debug(GeneratorJ.class.getName(), "generate");

		pr.println("using System;");
		pr.println("using System.Collections.Generic;");
		
    if (pctxt.isAwaitSupported()) {
      pr.println("using System.Threading.Tasks;");
    }
    
		pr.println("using byps;");
		pr.println();
    pr.print("namespace ").println(pctxt.renamePackage(rinfo.pack));
		pr.println("{");
		pr.beginBlock();
		pr.println();
		
		pctxt.printComments(pr, rinfo.comments);
		
    pr.checkpoint();
    CodePrinter mpr = pr.print("public interface ").print(interfaceName).print(" : BRemote");
    
    pr.beginBlock();
    for (String baseName : rinfo.baseQNames) {
      
      RemoteInfo rinfoBase = pctxt.classDB.getRemoteInfo(baseName);
      RemoteInfo rinfoImpl = getBaseRemoteInfo(rinfoBase);
    
      mpr.print(", ").println();
      mpr = pr.print(rinfoImpl.toString(rinfo.pack));
    }
      
    pr.endBlock();
    
    mpr.println(" {");
    pr.println();
		
		pr.beginBlock();
		
		for (MethodInfo minfo : rinfo.methods) {
			printMethod(minfo);
			printMethodDelegate(minfo);
			if (pctxt.isAwaitSupported()) {
			  printMethodAsync(minfo);
			}
//			printMethodBeginAsync(minfo);
//			printMethodEndAsync(minfo);
			pr.println();
		}
		
		pr.println();
		
		pr.endBlock();
		
		pr.println("}");

		pr.endBlock();
		pr.println("}  // end namespace");

		//log.debug(GeneratorJ.class.getName(), "generate");
	}

  protected String getBaseRemote() {
    return null;
  }
  
  protected RemoteInfo getBaseRemoteInfo(RemoteInfo rinfoBase) throws GeneratorException {
    return rinfoBase;
  }
  
	private final String interfaceName;
  protected final RemoteInfo rinfo;
	private final CodePrinter pr;
	private final PrintContext pctxt;
}
