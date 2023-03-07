package cn.shh.boot.starter.autoconfig.service;

import cn.shh.boot.starter.autoconfig.config.SelfStarterProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {
    private String info;
    @Autowired
    private SelfStarterProperties selfStarterProperties;

    public HelloService() {
    }

    public HelloService(String info) {
        this.info = info;
    }

    public String hello(String userName){
        System.out.println(info);
        return selfStarterProperties.getPrefix() + " " + userName + ", " + selfStarterProperties.getSuffix();
    }
}
