package com.cl.learn.springcloudlearn0.servicegate.fallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author l
 * @Date 2022/11/8 14:49
 */
@RestController
public class SelfHystrixController {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @RequestMapping("defaultfallback")
    public Map<String,String> defaultfallback(){
        logger.info("请求被熔断");
        Map<String,String> map = new HashMap<>();
        map.put("Code","fail");
        map.put("Message","服务异常");
        map.put("result","");
        return map;
    }
}
