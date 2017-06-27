package com.laoma.springtest.ioc.ioc05;

import org.springframework.stereotype.Repository;

/**
 * 图书数据访问实现类
 */
@Repository("bookdao01")
public class BookDAO implements IBookDAO {

    public String addBook(String bookname) {
        return "添加图书" + bookname + "成功！1";
    }
}
