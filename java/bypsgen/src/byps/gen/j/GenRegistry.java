package byps.gen.j;
/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.BBinaryModel;
import byps.BException;
import byps.gen.api.SerialInfo;
import byps.gen.utils.CodePrinter;

public class GenRegistry {
  static Log log = LogFactory.getLog(GenRegistry.class);

  static void generate(PrintContext pctxt, Iterable<SerialInfo> serInfos, BBinaryModel pformat) throws IOException {
    log.debug("generate");
    CodePrinter pr = pctxt.getPrinterForRegistry(pformat);
    new GenRegistry(pctxt, serInfos, pr, pformat).generate();
    pr.close();
    log.debug(")generate");
  }

  private GenRegistry(PrintContext pctxt, Iterable<SerialInfo> serInfos, CodePrinter pr, BBinaryModel pformat) {
    this.pctxt = pctxt;
    this.serInfos = serInfos;
    this.registryClassName = pctxt.getRegistryClassName(pformat);
    this.pack = pctxt.getRegistryPackage();
    this.pr = pr;
    this.pformat = pformat;
  }

  private void generate() throws IOException {
    log.debug("generate");

    pr.print("package ").print(pack).print(";").println();
    pr.println();

    pctxt.printDoNotModify(pr, getClass());

    pr.println("import byps.*;");
    pr.println();

    pr.print("public class ").print(registryClassName).println(" extends BRegistry { ");
    pr.println();

    pr.beginBlock();

    printConstructor();

    printGetSerializerByTypeId();

    pr.endBlock();

    pr.println("}");

    log.debug(")generate");
  }

  private void printConstructor() {
    log.debug("printConstructors(");

    pr.print("public ").print(registryClassName).println("() {");
    pr.beginBlock();
    if (pformat == BBinaryModel.JSON) {
      pr.println("super(BBinaryModel.JSON);");
    }
    else {
      pr.println("super(BBinaryModel.MEDIUM);");
    }
    pr.endBlock();
    pr.println("}");
    pr.println();

    log.debug("printConstructors");
  }

  private void printGetSerializerByTypeId() throws BException {

    ArrayList<SerialInfo> regInfos = pctxt.getSerializersForRegistrySortedByTypeId(serInfos);

    pr.println("private static BRegisteredSerializer[] serializers = new BRegisteredSerializer[] {");
    pr.beginBlock();
    for (SerialInfo serInfo : regInfos) {
      String serializerName = pctxt.getSerializerPackage(serInfo) + "." + pctxt.getSerializerClassName(serInfo, pformat);
      pr.print("new BRegisteredSerializer(").print(serInfo.typeId).print(", \"").print(serializerName).print("\"),").println();
    }
    pr.endBlock();
    pr.println("};");

    pr.println("@Override");
    pr.println("protected BRegisteredSerializer[] getSortedSerializers() {");

    pr.beginBlock();
    pr.println("return serializers;");
    pr.endBlock();
    pr.println("}");
  }

  private Iterable<SerialInfo> serInfos;
  private CodePrinter pr;
  private String pack;
  private String registryClassName;
  private PrintContext pctxt;
  private final BBinaryModel pformat;
}
