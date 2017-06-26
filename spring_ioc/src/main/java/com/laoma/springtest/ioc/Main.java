package com.laoma.springtest.ioc;

import com.laoma.springtest.ioc.domain.Bwm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: laoma
 * @create: 2017-06-26 下午5:46
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});

        Bwm bwm = (Bwm) context.getBean("bwm");

        bwm.sayName();
    }
}
