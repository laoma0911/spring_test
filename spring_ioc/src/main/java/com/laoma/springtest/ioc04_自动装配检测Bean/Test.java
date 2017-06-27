package com.laoma.springtest.ioc04_自动装配检测Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: laoma
 * @create: 2017-06-27 下午2:20
 */
public class Test {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @org.junit.Test
    public void autoCreate() {
        logger.info("初始化容器");
        //容器
        ApplicationContext context = new ClassPathXmlApplicationContext("IOCBeans04.xml");

        CarShopService shopService = (CarShopService) context.getBean("carShopServiceImpl");

        System.out.println(shopService.sellCar());


    }
}
