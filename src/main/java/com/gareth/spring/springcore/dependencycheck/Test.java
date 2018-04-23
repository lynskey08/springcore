package com.gareth.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//parent interface
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gareth/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);
		
	}

}
