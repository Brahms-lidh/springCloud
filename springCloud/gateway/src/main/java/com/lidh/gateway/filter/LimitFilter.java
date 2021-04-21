package com.lidh.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @description: 交易限流控制
 * @projectName:springCloud
 * @see:com.lidh.gateway.filter
 * @author:荔殿虎
 * @createTime:2021/4/21 16:17
 * @version:1.0
 */
@Component
public class LimitFilter extends ZuulFilter {

    @Override
    public String filterType() {
        // 前置过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 优先级为1，数字越大，优先级越低(在报文解密后进行处理)
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
