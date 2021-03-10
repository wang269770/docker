package com.wang.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Docker
 * @Description TODO
 * @Author WangHuaixian
 * @Since 2021/3/10 15:48
 **/

@RestController
@RequestMapping("/docker")
public class Docker {

    @GetMapping("/get")
    public String docker(){
        return "欢迎你部署成功";
    }
}

