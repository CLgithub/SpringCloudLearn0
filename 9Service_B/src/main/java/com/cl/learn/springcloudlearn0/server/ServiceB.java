package com.cl.learn.springcloudlearn0.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author l
 * @Date 2022/11/4 16:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceB {
    public static void main(String[] args) {
        SpringApplication.run(ServiceB.class, args);
    }
}
