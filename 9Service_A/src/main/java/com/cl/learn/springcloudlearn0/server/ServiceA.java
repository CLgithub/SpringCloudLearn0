package com.cl.learn.springcloudlearn0.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author l
 * @Date 2022/11/3 18:34
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //启用openFeign
public class ServiceA {
    public static void main(String[] args) {
        SpringApplication.run(ServiceA.class, args);
    }
}
