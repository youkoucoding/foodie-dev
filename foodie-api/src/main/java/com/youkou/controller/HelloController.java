package com.youkou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: com.youkou.controller
 * Author: youkou
 * Date: 2021/08/16
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }
}
