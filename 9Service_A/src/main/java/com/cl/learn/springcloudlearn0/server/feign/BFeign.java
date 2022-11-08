package com.cl.learn.springcloudlearn0.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author l
 * @Date 2022/11/4 16:17
 */
@Component
@FeignClient(value = "service-B", fallback = BFeignFB.class)
public interface BFeign {

    //----------------/B
    @RequestMapping("/B/m1")
    String m1();

}
