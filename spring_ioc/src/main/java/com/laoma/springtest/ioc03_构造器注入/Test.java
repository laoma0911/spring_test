package com.laoma.springtest.ioc03_构造器注入;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testCreateBeanWithConstructor() {
        //容器
        ApplicationContext context = new ClassPathXmlApplicationContext("IOCBeans03.xml");

        //getBean是参数要与xml中id要相同
        Chinese chinese = (Chinese) context.getBean("chinese");

        System.out.println(chinese.say());

    }
}
