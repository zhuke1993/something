package com.zhuke.something.guava;

import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by ZHUKE on 2016/8/31.
 */
public class TestFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        response.getWriter().print(JSON.toJSONString(((HttpServletRequest) request).getSession()));
        System.out.println(((HttpServletRequest) request).getSession().getId());
        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
