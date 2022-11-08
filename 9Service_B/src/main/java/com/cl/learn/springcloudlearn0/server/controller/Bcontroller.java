package com.cl.learn.springcloudlearn0.server.controller;

import com.cl.learn.springcloudlearn0.server.Utils;
import com.cl.learn.springcloudlearn0.server.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

/**
 * @Author l
 * @Date 2022/11/4 16:04
 */
@RestController
@RequestMapping("/B")
public class Bcontroller {
    @Autowired
    private BService bService;

    @RequestMapping("/m1")
    public String m1() throws UnknownHostException {
        return bService.m1().toString();
    }
}
