package com.cl.learn.springcloudlearn0.server.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author l
 * @Date 2022/11/7 10:36
 */
@Component
public class BFeignFB implements BFeign{

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public String m1() {
        logger.warn(Thread.currentThread().getStackTrace()[1].getMethodName()+" fallback!");
        Map<String,String> map = new HashMap<>();
        map.put("Code","fail");
        map.put("Message","服务异常");
        map.put("result","");
        return map.toString();
    }
}
