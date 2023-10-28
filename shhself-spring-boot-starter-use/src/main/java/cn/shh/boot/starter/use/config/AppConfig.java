package cn.shh.boot.starter.use.config;

import cn.shh.boot.starter.autoconfig.service.HelloService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AppProperties.class)
public class AppConfig {
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService("app set");
        return helloService;
    }
}