package com.cl.learn.springcloudlearn0.server.service.impl;

import com.cl.learn.springcloudlearn0.server.Utils;
import com.cl.learn.springcloudlearn0.server.config.MyConfig;
import com.cl.learn.springcloudlearn0.server.feign.BFeign;
import com.cl.learn.springcloudlearn0.server.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author l
 * @Date 2022/11/4 15:23
 */
@Service
public class AServiceImpl implements AService {

    @Autowired
    private BFeign bFeign;

    @Autowired
    private Environment environment;

    @Autowired
    private Utils utils;

    @Autowired
    private MyConfig myConfig;

    @Override
    public Object m1() throws UnknownHostException {
        String local1 =utils.getLocal(InetAddress.getLocalHost(), environment);
        Object o = bFeign.m1();
        try {
            Thread.sleep(myConfig.getS()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return local1+o;
    }


}
