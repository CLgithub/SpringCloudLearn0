package com.cl.learn.springcloudlearn0.server;


/**
 * @Author l
 * @Date 2022/11/4 15:49
 */
public class CommonResult<T> {

    private Long code;
    private String message;
    private T data;

    public CommonResult(Long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
