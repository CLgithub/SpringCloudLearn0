package com.cl.learn.springcloudlearn0.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Author l
 * @Date 2022/12/7 16:45
 */
@SpringBootConfiguration    // 此类为springBoot配置类
@RefreshScope   // 无需重启程序，动态刷新，需要动态熟悉的相关配置放在此类中
public class MyConfig {

    @Value("${sleep.s}")
    private long s;

    public long getS() {
        return s;
    }
}
