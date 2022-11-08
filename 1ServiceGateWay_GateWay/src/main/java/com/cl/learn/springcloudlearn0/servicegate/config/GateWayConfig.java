package com.cl.learn.springcloudlearn0.servicegate.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

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
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        RouteLocator routes_b= routes.route( "routes_B", r->r.path("/B/**").uri("lb://service-B") ).build();
//        RouteLocator routes_b= routes.route( "routes_B", (r)->{return r.path("/B/**").uri("lb://service-B");} ).build();
        return routes_b;
    }

}
