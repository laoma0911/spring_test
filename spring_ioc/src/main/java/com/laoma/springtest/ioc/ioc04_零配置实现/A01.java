package com.laoma.springtest.ioc.ioc04_零配置实现;

import org.springframework.stereotype.Service;

@Service
public class A01 {
    public A01() {
        System.out.println("A01");
    }

    public String msg = "a";
}