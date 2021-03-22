package com.lidh.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ThirdPreFilter extends ZuulFilter {
	
	private static final Logger log = LoggerFactory.getLogger(ThirdPreFilter.class);
	
	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		return 3;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		log.info("这是ThirdPreFilter");
		// 从RequestContext中获取上下文信息
		RequestContext context = RequestContext.getCurrentContext();
		// 从上下文中获取HttpServletRequest
		HttpServletRequest ctx = context.getRequest();
		// 从request中获取参数a信息
		return null;
	}

}
