package com.cl.learn.springcloudlearn0.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * nacos 服务配置
 * 1、引入jar
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *         注意版本，否则不能启动，版本参考：https://github.com/alibaba/spring-cloud-alibaba/wiki/版本说明
 * 2.bootstrap.properties
 *      # nacos 地址
 *      spring.cloud.nacos.server-addr=vUbuntu4:8848
 *      # 配置id
 *      spring.application.name=serviceB
 * 3. 有@value处 需要在类上配置@RefreshScope 才能自动刷新
 * 4. 在nacos中添加配置，Data ID=serviceB Group=DEFAULT_GROUP
 *
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceB {
    public static void main(String[] args) {
        SpringApplication.run(ServiceB.class, args);
    }
}
