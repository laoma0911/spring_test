package com.laoma.springtest.ioc.ioc01_XML配置;

/**
 * 图书数据访问实现类
 */
public class BookDAO implements IBookDAO {

	public String addBook(String bookname) {
		return "添加图书"+bookname+"成功！";
	}
}
