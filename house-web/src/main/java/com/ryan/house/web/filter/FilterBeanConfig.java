package com.ryan.house.web.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/14.
 */

@Configuration
public class FilterBeanConfig {

    /**
     * 1.构造filter
     * 2.配置拦截的urlPattern
     * 3.利用FilterRegistrationBean进行包装
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        List<String> urlist = new ArrayList<String>();
        urlist.add("*");
        filterRegistrationBean.setUrlPatterns(urlist);
        return filterRegistrationBean;
    }


}
