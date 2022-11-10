package com.cl.learn.springcloudlearn0.servicegate.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.UriSpec;
import org.springframework.context.annotation.Bean;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.function.Function;

/**
 * @Author l
 * @Date 2022/11/7 16:49
 */
@SpringBootConfiguration
public class GateWayConfig {

    // 第二种配置方式 http://ip:8101/B/m1 ---> http://vubuntu4:8902/B/m1
    @Bean
    public RouteLocator routes(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route("routes_B", r->r.path("/B/**").uri("lb://service-B") )
//                .route("routes_B", (r)->{return r.path("/B/**").uri("lb://service-B");} )
                .build();
    }
}
