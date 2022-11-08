package com.cl.learn.springcloudlearn0.server.service.impl;

import com.cl.learn.springcloudlearn0.server.Utils;
import com.cl.learn.springcloudlearn0.server.feign.BFeign;
import com.cl.learn.springcloudlearn0.server.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public Object m1() throws UnknownHostException {
        String local1 =utils.getLocal(InetAddress.getLocalHost(), environment);
        Object o = bFeign.m1();
        String local2 = utils.getLocal(InetAddress.getLocalHost(), environment);
        return local1+o+local2;
    }



}
