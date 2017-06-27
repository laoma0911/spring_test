package com.laoma.springtest.ioc.ioc06;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 图书业务类
 */
@Service
public class BookService {
    @Resource
    IBookDAO bookDAO;

    public void storeBook(String bookname) {
        System.out.println("图书上货");
        String result = bookDAO.addBook(bookname);
        System.out.println(result);
    }
}
