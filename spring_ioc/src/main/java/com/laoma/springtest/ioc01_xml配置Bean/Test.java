package com.laoma.springtest.ioc01_xml配置Bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testCreateBeanByXml() {
        //容器
        ApplicationContext context = new ClassPathXmlApplicationContext("IOCBeans01.xml");

        //getBean是参数要与xml中id要相同
        XmlBean xmlBean = (XmlBean) context.getBean("xmlBean");

        System.out.println(xmlBean.toString());

    }
}
