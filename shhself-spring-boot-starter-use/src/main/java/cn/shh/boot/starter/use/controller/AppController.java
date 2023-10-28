package cn.shh.boot.starter.use.controller;

import cn.shh.boot.starter.autoconfig.service.HelloService;
import cn.shh.boot.starter.use.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app")
public class AppController {
    @Autowired
    private AppProperties appProperties;
    @Autowired
    private HelloService helloService;

    @GetMapping("/m1")
    public AppProperties m1(){
        return appProperties;
    }

    @GetMapping("/m2")
    public String m2(){
        return helloService.hello("zhangsan");
    }
}