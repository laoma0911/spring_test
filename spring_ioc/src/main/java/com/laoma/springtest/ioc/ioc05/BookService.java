package com.laoma.springtest.ioc.ioc05;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 图书业务类
 */
@Service
public class BookService {

    public IBookDAO getDaoofbook() {
        return daoofbook;
    }

	/*
    @Autowired
	@Qualifier("bookdao02")
	public void setDaoofbook(IBookDAO daoofbook) {
		this.daoofbook = daoofbook;
	}*/

    @Resource(name = "bookdao02")
    public void setDaoofbook(IBookDAO daoofbook) {
        this.daoofbook = daoofbook;
    }

    /*
    @Autowired
    @Qualifier("bookdao02")
    */
    IBookDAO daoofbook;
	
	/*
	public BookService(@Qualifier("bookdao02") IBookDAO daoofbook) {
		this.daoofbook=daoofbook;
	}*/

    public void storeBook(String bookname) {
        System.out.println("图书上货");
        String result = daoofbook.addBook(bookname);
        System.out.println(result);
    }
}
