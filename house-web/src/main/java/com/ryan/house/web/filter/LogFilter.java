package com.ryan.house.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Administrator on 2018/6/14.
 */
public class LogFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        logger.info("Request------coming");
        filterChain.doFilter(servletRequest, servletResponse);//chain.doFilter将请求转发给过滤器链下一个filter , 如果没有filter那就是你请求的资源

    }

    @Override
    public void destroy() {

    }


}
