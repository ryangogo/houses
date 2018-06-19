package com.ryan.house.web.autoconfig;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/6/17.
 */

@Configuration
@ConditionalOnClass({HttpClient.class})
@EnableConfigurationProperties(HttpClientProperties.class)
public class HttpClientAutoConfig {

    private final HttpClientProperties properties;

    public HttpClientAutoConfig(HttpClientProperties properties) {
        this.properties = properties;
    }

    /**
     * httpclient bean的定义
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(HttpClient.class)
    public HttpClient httpClient() {
        RequestConfig requestConfig = RequestConfig.custom().
                setConnectionRequestTimeout(properties.getConnectTimeOut()).
                setSocketTimeout(properties.getSocketTimeOut()).build();//构建requestConfig
        HttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).setUserAgent(properties.getAgent()).
                setMaxConnPerRoute(properties.getMaxConnperRoute()).setConnectionReuseStrategy(new NoConnectionReuseStrategy()).build();
        return httpClient;
    }

}
