package com.lidh.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @description: 返回数据加密处理
 * @projectName:springCloud
 * @see:com.lidh.gateway.filter
 * @author:荔殿虎
 * @createTime:2021/4/21 16:21
 * @version:1.0
 */
public class EncrypFilter extends ZuulFilter {

    @Override
    public String filterType() {
        // 处理完成后
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 99;
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
