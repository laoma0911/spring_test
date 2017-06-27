package com.laoma.springtest.ioc.ioc02_Spring注解;

import org.springframework.stereotype.Component;

/**
 * 图书数据访问实现类
 */
@Component
public class BookDAO implements IBookDAO {

    public String addBook(String bookname) {
        return "添加图书" + bookname + "成功！";
    }
}
