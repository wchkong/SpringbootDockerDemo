package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kongweichang
 * @Date: 2019/5/9 16:58
 */
@RestController
public class DockerController {
    @RequestMapping("/")
    public String index() {
        return "Hello Docker!";
    }
}
