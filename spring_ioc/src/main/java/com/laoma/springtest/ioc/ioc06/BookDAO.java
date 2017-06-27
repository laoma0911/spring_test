package com.laoma.springtest.ioc.ioc06;

import org.springframework.stereotype.Repository;

/**
 * 图书数据访问实现类
 */
@Repository
public class BookDAO implements IBookDAO {
	public BookDAO() {
		System.out.println(this.getClass().getName()+"实例化了");
	}
	public String addBook(String bookname) {
		return "添加图书"+bookname+"成功！";
	}
}
