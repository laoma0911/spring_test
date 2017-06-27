package com.laoma.springtest.ioc.iocTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.laoma.springtest.ioc.ioc04_零配置实现")
public class ApplicationCfg {
    @Bean
    public Student getStudent() {
        return new Student();
    }
}
