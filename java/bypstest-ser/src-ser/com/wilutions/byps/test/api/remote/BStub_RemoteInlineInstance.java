﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:159
public class BStub_RemoteInlineInstance extends BStub implements RemoteInlineInstanceAsync, java.io.Serializable {
	
	// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:142
	public final static long serialVersionUID = 1206670536L;
	
	public BStub_RemoteInlineInstance(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setActor(com.wilutions.byps.test.api.inl.Actor act) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setActor(act, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_setActor(com.wilutions.byps.test.api.inl.Actor act, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_setActor req = new BRequest_RemoteInlineInstance_setActor();		
		req.act = act;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public com.wilutions.byps.test.api.inl.Actor getActor() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<com.wilutions.byps.test.api.inl.Actor> asyncResult = new BSyncResult<com.wilutions.byps.test.api.inl.Actor>();		
		async_getActor(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_getActor(final BAsyncResult<com.wilutions.byps.test.api.inl.Actor> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_getActor req = new BRequest_RemoteInlineInstance_getActor();		
		BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Actor> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Actor>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setPoint2DArray1dim(com.wilutions.byps.test.api.inl.Point2D[] pointArray) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setPoint2DArray1dim(pointArray, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_setPoint2DArray1dim(com.wilutions.byps.test.api.inl.Point2D[] pointArray, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_setPoint2DArray1dim req = new BRequest_RemoteInlineInstance_setPoint2DArray1dim();		
		req.pointArray = pointArray;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public com.wilutions.byps.test.api.inl.Point2D[] getPoint2DArray1dim() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<com.wilutions.byps.test.api.inl.Point2D[]> asyncResult = new BSyncResult<com.wilutions.byps.test.api.inl.Point2D[]>();		
		async_getPoint2DArray1dim(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_getPoint2DArray1dim(final BAsyncResult<com.wilutions.byps.test.api.inl.Point2D[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_getPoint2DArray1dim req = new BRequest_RemoteInlineInstance_getPoint2DArray1dim();		
		BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[]> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setPoint2DArray4dim(com.wilutions.byps.test.api.inl.Point2D[][][][] pointArray) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setPoint2DArray4dim(pointArray, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_setPoint2DArray4dim(com.wilutions.byps.test.api.inl.Point2D[][][][] pointArray, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_setPoint2DArray4dim req = new BRequest_RemoteInlineInstance_setPoint2DArray4dim();		
		req.pointArray = pointArray;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public com.wilutions.byps.test.api.inl.Point2D[][][][] getPoint2DArray4dim() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<com.wilutions.byps.test.api.inl.Point2D[][][][]> asyncResult = new BSyncResult<com.wilutions.byps.test.api.inl.Point2D[][][][]>();		
		async_getPoint2DArray4dim(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_getPoint2DArray4dim(final BAsyncResult<com.wilutions.byps.test.api.inl.Point2D[][][][]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_getPoint2DArray4dim req = new BRequest_RemoteInlineInstance_getPoint2DArray4dim();		
		BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[][][][]> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[][][][]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setPoint2DList(java.util.List<com.wilutions.byps.test.api.inl.Point2D> pointList) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setPoint2DList(pointList, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_setPoint2DList(java.util.List<com.wilutions.byps.test.api.inl.Point2D> pointList, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_setPoint2DList req = new BRequest_RemoteInlineInstance_setPoint2DList();		
		req.pointList = pointList;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public java.util.List<com.wilutions.byps.test.api.inl.Point2D> getPoint2DList() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<java.util.List<com.wilutions.byps.test.api.inl.Point2D>> asyncResult = new BSyncResult<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>();		
		async_getPoint2DList(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_getPoint2DList(final BAsyncResult<java.util.List<com.wilutions.byps.test.api.inl.Point2D>> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_getPoint2DList req = new BRequest_RemoteInlineInstance_getPoint2DList();		
		BAsyncResultReceiveMethod<java.util.List<com.wilutions.byps.test.api.inl.Point2D>> outerResult = new BAsyncResultReceiveMethod<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setPoint2DListList(java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>> pointListList) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setPoint2DListList(pointListList, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_setPoint2DListList(java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>> pointListList, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_setPoint2DListList req = new BRequest_RemoteInlineInstance_setPoint2DListList();		
		req.pointListList = pointListList;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>> getPoint2DListList() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>> asyncResult = new BSyncResult<java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>>();		
		async_getPoint2DListList(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_getPoint2DListList(final BAsyncResult<java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_getPoint2DListList req = new BRequest_RemoteInlineInstance_getPoint2DListList();		
		BAsyncResultReceiveMethod<java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>> outerResult = new BAsyncResultReceiveMethod<java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setPoint2DMap(java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D> pointMap) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setPoint2DMap(pointMap, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_setPoint2DMap(java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D> pointMap, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_setPoint2DMap req = new BRequest_RemoteInlineInstance_setPoint2DMap();		
		req.pointMap = pointMap;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D> getPoint2DMap() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D>> asyncResult = new BSyncResult<java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D>>();		
		async_getPoint2DMap(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_getPoint2DMap(final BAsyncResult<java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D>> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_RemoteInlineInstance_getPoint2DMap req = new BRequest_RemoteInlineInstance_getPoint2DMap();		
		BAsyncResultReceiveMethod<java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D>> outerResult = new BAsyncResultReceiveMethod<java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D>>(asyncResult);
		transport.send(req, outerResult);
	}
	
	
}
