package com.laoma.springtest.ioc.ioc06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 容器的配置类
 */
@Configuration
@ComponentScan(basePackages = "com.laoma.springtest.ioc.ioc06")
public class ApplicationCfg {
    @Bean
    public User getUser() {
        return new User("成功");
    }
}
