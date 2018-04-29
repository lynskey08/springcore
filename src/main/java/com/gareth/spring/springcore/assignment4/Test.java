package com.gareth.spring.springcore.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//reading in multiple elements from a property file
public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gareth/spring/springcore/assignment4/config.xml");
		MyDAO dao = (MyDAO) ctx.getBean("myDAO");
		System.out.println(dao);

	}

}
