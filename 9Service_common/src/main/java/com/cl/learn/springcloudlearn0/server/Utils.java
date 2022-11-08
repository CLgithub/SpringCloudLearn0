package com.cl.learn.springcloudlearn0.server;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;

/**
 * @Author l
 * @Date 2022/11/4 16:05
 */
@Component
public class Utils {
    public static final SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String getLocal(InetAddress localHost, Environment environment) throws UnknownHostException {
        long l = System.currentTimeMillis();
        String hostName = localHost.getHostName();
        String local=l+"-"+hostName+"-"+environment.getProperty("spring.application.name");
        return local+"------>";
    }
}
