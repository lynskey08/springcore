package com.gareth.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// parent interface
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gareth/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition addition = (Addition) ctx.getBean("addition");
		System.out.println(addition);

	}
}
