package com.laoma.springtest.ioc.ioc04_零配置实现;

import org.springframework.stereotype.Repository;

@Repository
public class B01 {
	public B01() {
		System.out.println("B01");
	}
}
