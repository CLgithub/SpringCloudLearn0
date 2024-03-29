package com.cl.learn.springcloudlearn0.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author l
 * @Date 2022/11/3 18:34
 */
@SpringBootApplication  // 此项目为一个springBoot项目
@EnableDiscoveryClient  // 启用服务注册发现
@EnableFeignClients     // 启用feign调用
public class ServiceA {
    public static void main(String[] args) {
        SpringApplication.run(ServiceA.class, args);
    }
}
