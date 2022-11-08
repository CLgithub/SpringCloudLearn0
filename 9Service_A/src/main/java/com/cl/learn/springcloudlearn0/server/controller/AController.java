package com.cl.learn.springcloudlearn0.server.controller;

import com.cl.learn.springcloudlearn0.server.Utils;
import com.cl.learn.springcloudlearn0.server.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

/**
 * @Author l
 * @Date 2022/11/4 15:21
 */
@RestController
@RequestMapping("/A")
public class AController {

    @Autowired
    private AService AService;

    @RequestMapping("/m1")
    public Object m1() throws UnknownHostException {
        return AService.m1();
    }
}
