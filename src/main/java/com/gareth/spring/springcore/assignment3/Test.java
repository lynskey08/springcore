package com.gareth.spring.springcore.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// parent interface
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gareth/spring/springcore/assignment3/config.xml");
		University uni = (University) ctx.getBean("university");
		System.out.println(uni);
		
		University uni2 = (University) ctx.getBean("university");
		System.out.println(uni2);

	}

}
