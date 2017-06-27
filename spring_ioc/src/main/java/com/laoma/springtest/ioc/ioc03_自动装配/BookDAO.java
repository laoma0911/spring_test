package com.laoma.springtest.ioc.ioc03_自动装配;

import org.springframework.stereotype.Repository;

/**
 * 图书数据访问实现类
 */
@Repository
public class BookDAO implements IBookDAO {

    public String addBook(String bookname) {
        return "添加图书" + bookname + "成功！";
    }
}
