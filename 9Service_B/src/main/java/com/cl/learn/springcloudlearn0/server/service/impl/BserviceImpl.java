package com.cl.learn.springcloudlearn0.server.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.cl.learn.springcloudlearn0.server.Utils;
import com.cl.learn.springcloudlearn0.server.config.MyConfig;
import com.cl.learn.springcloudlearn0.server.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author l
 * @Date 2022/11/4 16:08
 */
@Service
public class BserviceImpl implements BService {

    @Autowired
    private Environment environment;
    @Autowired
    private Utils utils;

    @Autowired
    private MyConfig myConfig;

    @Override
    @SentinelResource(value = "bm1", fallback = "fb")
    public Object m1() throws UnknownHostException {
        try {
            Thread.sleep(myConfig.getS()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myConfig.getValue()+"_"+utils.getLocal(InetAddress.getLocalHost(), environment);
    }

    @SentinelResource("fb")
    public Object fb(){
        return "bm1-限流";
    }


}
