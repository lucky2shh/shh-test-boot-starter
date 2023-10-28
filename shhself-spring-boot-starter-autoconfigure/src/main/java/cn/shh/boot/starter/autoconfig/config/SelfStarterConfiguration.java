package cn.shh.boot.starter.autoconfig.config;

import cn.shh.boot.starter.autoconfig.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SelfStarterProperties.class)
public class SelfStarterConfiguration {
    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        return new HelloService("SelfStarter autoconfigure");
    }
}