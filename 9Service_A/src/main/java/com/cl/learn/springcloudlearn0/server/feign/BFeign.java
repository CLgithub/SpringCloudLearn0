package com.cl.learn.springcloudlearn0.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author l
 * @Date 2022/11/4 16:17
 */
@Component
@FeignClient(value = "serviceB", fallback = BFeignFB.class)     // feign调用 配置被调用的服务 以及兜底处理类
public interface BFeign {

    //----------------/B
    @RequestMapping("/B/m1")
    String m1();

}
