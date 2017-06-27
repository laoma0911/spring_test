package com.laoma.springtest.ioc.ioc02_Spring注解;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 图书业务类
 */
@Component
public class BookService {
    IBookDAO bookDAO;

    public void storeBook(String bookname) {
        //容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("IOCBeans02.xml");
        //从容器中获得id为bookdao的bean
        bookDAO = (IBookDAO) ctx.getBean("bookDAO");
        System.out.println("图书上货");
        String result = bookDAO.addBook(bookname);
        System.out.println(result);
    }
}
