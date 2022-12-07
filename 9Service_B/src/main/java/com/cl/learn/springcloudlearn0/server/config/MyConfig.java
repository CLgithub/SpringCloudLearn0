package com.cl.learn.springcloudlearn0.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Author l
 * @Date 2022/12/7 16:11
 */
@SpringBootConfiguration
@RefreshScope
public class MyConfig {

    @Value(value = "${sleep.s}" )
    private long s;
    @Value("${value}")
    private String value;

    public long getS() {
        return s;
    }

    public String getValue() {
        return value;
    }

}
