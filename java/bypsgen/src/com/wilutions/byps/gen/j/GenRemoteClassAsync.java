package com.wilutions.byps.gen.j;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.wilutions.byps.gen.api.GeneratorException;
import com.wilutions.byps.gen.api.MethodInfo;
import com.wilutions.byps.gen.api.RemoteInfo;
import com.wilutions.byps.gen.utils.CodePrinter;

class GenRemoteClassAsync {

  static Log log = LogFactory.getLog(GenRemoteClassAsync.class);

  static void generate(PrintContext pctxt, RemoteInfo rinfo, RemoteInfo rinfoAsync) throws IOException {
    // log.debug(GeneratorJ.class.getName(), "generate");

    if (rinfoAsync == null) return;
    
    log.info("generate " + rinfoAsync.qname);
    CodePrinter pr = pctxt.getPrinterForApiClass(rinfoAsync, "", true);
    new GenRemoteClassAsync(pctxt, rinfo, rinfoAsync, pr).generate();
    pr.close();

    // log.debug(GeneratorJ.class.getName(), "generate");
  }

  protected GenRemoteClassAsync(PrintContext pctxt, RemoteInfo rinfoBase, RemoteInfo rinfoAsync, CodePrinter pr) {
    this.rinfoAsync = rinfoAsync;
    this.pr = pr;
    this.pctxt = pctxt;
    this.rinfoBase = rinfoBase;
  }

  private void printMethod(MethodInfo methodInfo) throws IOException {
    // log.debug(GeneratorJ.class.getName(), "printMember");

    pctxt.printComments(pr, methodInfo.comments);

    CodePrinter mpr = pctxt.printDeclareMethod(pr, rinfoAsync, methodInfo);
    mpr.println(";");

    // log.debug(GeneratorJ.class.getName(), "printMember");
  }

  private void printMethodAsync(MethodInfo methodInfo) throws IOException {
    // log.debug(GeneratorJ.class.getName(), "printMethodAsync");

    CodePrinter mpr = pctxt.printDeclareMethodAsync(pr, rinfoAsync, methodInfo);
    mpr.println(";");

    // log.debug(GeneratorJ.class.getName(), "printMethodAsync");
  }

  protected void generate() throws IOException {
    // log.debug(GeneratorJ.class.getName(), "generate");

    pr.print("package ").print(rinfoAsync.pack).print(";").println();
    pr.println();

    pctxt.printDoNotModify(pr, getClass());

    pr.println("import com.wilutions.byps.*;");
    pr.println();

    pr.checkpoint();
    
    pr.print("public interface ").print(rinfoAsync.name);

    CodePrinter mpr = pr.print(" extends BRemote");

    pr.beginBlock();
    
    String baseRemote = getBaseRemote();
    if (baseRemote != null) {
      mpr.print(", ").println();
      mpr = pr.print(baseRemote);
    }

    for (String baseName : rinfoAsync.baseQNames) {

      RemoteInfo rinfo = pctxt.classDB.getRemoteInfo(baseName);
      RemoteInfo rinfoImpl = getBaseRemoteInfo(rinfo);
      
      mpr.print(", ").println();
      mpr = pr.print(rinfoImpl.qname);
    }

    pr.endBlock();

    mpr.println(" {");

    pr.beginBlock();

    for (MethodInfo minfo : rinfoAsync.methods) {
      printMethod(minfo);
      printMethodAsync(minfo);
      pr.println();
    }

    pr.println();

    pr.endBlock();

    pr.println("}");

    // log.debug(GeneratorJ.class.getName(), "generate");
  }
  
  protected String getBaseRemote() {
    return rinfoBase.name;
  }
  
  protected RemoteInfo getBaseRemoteInfo(RemoteInfo rinfo) throws GeneratorException {
    return rinfo.getRemoteAsync();
  }

  protected final RemoteInfo rinfoAsync;
  protected final RemoteInfo rinfoBase;
  protected final CodePrinter pr;
  protected final PrintContext pctxt;
}
