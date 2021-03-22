package com.lidh.busi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class BaseAction<Q, P> {

	protected String ver = "1.0";

	// 是否打印请求报文
	protected boolean isDebugReuqet() {
		return true;
	}

	// 是否打印返回报文
	protected boolean isDebugResponse() {
		return true;
	}

	protected String doService(HttpServletRequest request, HttpServletResponse response) {
		//初始化业务上下文
		System.out.println("11111111");
		return "1";
	}
	
	/**
	 * 处理请求
	 * @param request
	 * @param response
	 * @throws BusiErrorException
	 */
	public abstract void doService(Q request, P response) throws Exception;
	
}
