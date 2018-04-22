package com.gareth.spring.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		ShoppingCart sc = (ShoppingCart) ctx.getBean("shoppingcart");
		System.out.println(sc);
	}

}
