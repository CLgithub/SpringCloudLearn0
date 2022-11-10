package com.cl.learn.springcloudlearn0.server.service.impl;

import com.cl.learn.springcloudlearn0.server.Utils;
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
    @Value("${sleep.s}")
    private long s;

    @Override
    public Object m1() throws UnknownHostException {
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return utils.getLocal(InetAddress.getLocalHost(), environment);
    }


}