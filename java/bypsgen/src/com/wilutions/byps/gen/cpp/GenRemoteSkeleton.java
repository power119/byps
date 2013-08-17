package com.wilutions.byps.gen.cpp;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.wilutions.byps.BRegistry;
import com.wilutions.byps.gen.api.MemberInfo;
import com.wilutions.byps.gen.api.MethodInfo;
import com.wilutions.byps.gen.api.RemoteInfo;
import com.wilutions.byps.gen.cpp.PrintContext.EMethodDecl;
import com.wilutions.byps.gen.utils.CodePrinter;

class GenRemoteSkeleton {
	
	static Log log = LogFactory.getLog(GenRemoteSkeleton.class);
	
	static void generate(PrintContext pctxt, RemoteInfo rinfo) throws IOException {
		//log.debug(GeneratorJ.class.getName(), "generate");
		log.info("generate " + rinfo.qname);
		new GenRemoteSkeleton(pctxt, rinfo).generate();
		//log.debug(GeneratorJ.class.getName(), "generate");
	}

	private GenRemoteSkeleton(PrintContext pctxt, RemoteInfo rinfo) {
		this.pctxt = pctxt;
		this.cppInfo = new TypeInfoCpp(rinfo);
		this.baseCppInfo = cppInfo.getBaseInfo();
		this.prH = pctxt.getPrApiAllH();
		this.prC = pctxt.getPrImplC();
		this.rinfo = rinfo;
	}
	
	private void printMethod(MethodInfo methodInfo) throws IOException {
		//log.debug(GeneratorJ.class.getName(), "printMethod");
		
		pctxt.printDeclareMethod(prH, rinfo, methodInfo, EMethodDecl.Header).println(";");
		
		pctxt.printDeclareMethod(prC, rinfo, methodInfo, EMethodDecl.SkeletonImpl).println(" {");
		
		prC.beginBlock();
		prC.println("throw BException(EX_UNSUPPORTED_METHOD, L\"\");");
		prC.endBlock();
		prC.println("}");
		
		//log.debug(GeneratorJ.class.getName(), "printMethod");
	}
	
	private void printMethodAsync(MethodInfo methodInfo) throws IOException {
		//log.debug(GeneratorJ.class.getName(), "printMethodAsync");
		
		pctxt.printDeclareMethodAsync(prH, rinfo, methodInfo, EMethodDecl.Header).println(";");
		
		pctxt.printDeclareMethodAsync(prC, rinfo, methodInfo, EMethodDecl.SkeletonImpl).println(" {");
		prC.beginBlock();
		
		MemberInfo returnInfo = methodInfo.resultInfo.members.get(0);
		boolean isReturnVoid = returnInfo.type.typeId == BRegistry.TYPEID_VOID;
		
		if (isReturnVoid) {
			prC.println("bool ret = false;");
		}
		else {
			TypeInfoCpp tinfoCpp = new TypeInfoCpp(returnInfo.type);
			String rtype = tinfoCpp.toString(rinfo.pack);
			prC.print(rtype).print(" ret = ").print(rtype).println("();");
		}
		
		prC.println("try {");
		prC.beginBlock();
		
		String methodName = pctxt.makePublicMemberName(methodInfo.name);
		CodePrinter mpr = prC;
		if (!isReturnVoid) mpr = prC.print("ret = ");
		mpr = mpr.print(methodName + "(");
		
		boolean first = true;
		for (MemberInfo pinfo : methodInfo.requestInfo.members) {
			if (first) first = false; else mpr.print(", ");
			mpr.print(pinfo.name);
		}
		mpr.println(");");
		
		if (pctxt.lambdaSupported) {
			prC.println("asyncResult(ret, BException());");
		}
		else {
			prC.println("asyncResult->setAsyncResult(BVariant(ret));");
		}
		
		prC.endBlock();
//		pr.println("} catch (RemoteException e) {");
//		pr.beginBlock();
//		pr.println("asyncResult.setException(e);");
//		pr.endBlock();
		prC.println("} catch (const std::exception& ex) {");
		prC.beginBlock();
		if (pctxt.lambdaSupported) {
			prC.print("asyncResult(ret, ex);").println();
		}
		else {
			prC.print("asyncResult->setAsyncResult(BVariant(ex));").println();
		}
		prC.endBlock();
//		pr.println("} finally {");
//		pr.beginBlock();
//		pr.endBlock();
		prC.println("}");
		
		prC.endBlock();
		prC.println("}");
		//log.debug(GeneratorJ.class.getName(), "printMethodAsync");
	}
	
	private void generate() throws IOException {
		//log.debug(GeneratorJ.class.getName(), "generate");

		TypeInfoCpp skeletonCppType = pctxt.getSkeletonTypeInfoCpp(rinfo);
		String className = skeletonCppType.getClassName(rinfo.pack);
		
		pctxt.printLine(prH);
		prH.print("// Skeleton class ").println(className);
		prH.println("// Your interface implementation class has to be derived from this skeleton.");
		prH.println("// Either provide an asynchronous or a synchronous function in your subclass.");
		prH.println();
		prC.println();
		prH.println(cppInfo.namespaceBegin);
		prC.println(cppInfo.namespaceBegin);
		prH.println();
		prC.println();
		prH.println("using namespace ::com::wilutions::byps;");
		prH.println();
		
		prH.print("class ").print(className).println(";");
		prH.print("typedef byps_ptr<").print(className).print("> ").print(skeletonCppType.getTypeName(rinfo.pack)).println(";");
		prH.println();
		
		prH.print("class ").print(className)
			.print(" : public BSkeleton, public ").print(rinfo.name)
			.print(" {");
		prH.println();

		prH.beginBlock();
		prH.println();
		
		pctxt.print_BSerializable_getTypeId(rinfo, prH);

		for (MethodInfo minfo : rinfo.methods) {
			printMethod(minfo);
			printMethodAsync(minfo);
			prH.println();
		}
		
		prH.println();
		
		prH.endBlock();
		
		prH.println("};");
		
		prH.println(cppInfo.namespaceEnd);
		prH.println();
		prC.println(cppInfo.namespaceEnd);
		prC.println();

		//log.debug(GeneratorJ.class.getName(), "generate");
	}

//	private void printConstructor() {
//		pr.print("public ").print(className).print("(BTransport transport) {").println();
//		pr.beginBlock();
//		pr.println("super(transport);");
//		pr.endBlock();
//		pr.println("}");
//	}

	private final RemoteInfo rinfo;
	private final PrintContext pctxt;
	private final TypeInfoCpp cppInfo;
	private final TypeInfoCpp baseCppInfo;
	private final CodePrinter prH;
	private final CodePrinter prC;


	
}
