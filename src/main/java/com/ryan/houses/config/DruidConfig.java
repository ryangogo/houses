package com.ryan.houses.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.google.common.collect.Lists;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2018/6/14.
 */

/*@Configuration*/
public class DruidConfig {

    /**
     * 该注解的作用为将返回对象与配置文件进行绑定
     *
     * @return
     */
    /*@ConfigurationProperties(prefix = "spring.druid")*/
    /*@Bean(initMethod = "init",destroyMethod = "close")*/
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setProxyFilters(Lists.newArrayList(statFilter()));
        return druidDataSource;
    }

    /**
     * 如果遇到慢sql就将sql通过日志的方式进行打印
     *
     * @return
     */
    @Bean
    public Filter statFilter() {
        StatFilter statFilter = new StatFilter();
        /*statFilter.setSlowSqlMillis(5000);//设置慢sql的标准,这里的设置为5秒*/
        statFilter.setSlowSqlMillis(1);//设置慢sql的标准,这里的设置为5秒
        statFilter.setLogSlowSql(true);//是否要打印
        statFilter.setMergeSql(true);//是否要打印
        return statFilter;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    }


}
