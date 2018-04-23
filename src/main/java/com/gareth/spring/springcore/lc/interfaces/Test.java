package com.gareth.spring.springcore.lc.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//parent interface
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gareth/spring/springcore/lc/interfaces/config.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println(patient);
		//method that we need to invoke on the abstract application context
		//which tells the spring container that it need to invoke the 
		//destroy methods
		ctx.registerShutdownHook();
	}

}
