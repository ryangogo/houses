package com.ryan.house.web.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2018/6/17.
 */

@ConfigurationProperties(prefix = "spring.httpclient")
public class HttpClientProperties {

    private Integer connectTimeOut = 1000;

    private Integer socketTimeOut = 10000;

    private String agent = "agent";
    private Integer maxConnPerRoute = 10;//最大连接数
    private Integer maxConnTotaol = 50;//总连接数

    public Integer getConnectTimeOut() {
        return connectTimeOut;
    }

    public void setConnectTimeOut(Integer connectTimeOut) {
        this.connectTimeOut = connectTimeOut;
    }

    public Integer getSocketTimeOut() {
        return socketTimeOut;
    }

    public void setSocketTimeOut(Integer socketTimeOut) {
        this.socketTimeOut = socketTimeOut;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Integer getMaxConnperRoute() {
        return maxConnPerRoute;
    }

    public void setMaxConnperRoute(Integer maxConnperRoute) {
        this.maxConnPerRoute = maxConnperRoute;
    }

    public Integer getMaxConnTotaol() {
        return maxConnTotaol;
    }

    public void setMaxConnTotaol(Integer maxConnTotaol) {
        this.maxConnTotaol = maxConnTotaol;
    }
}
