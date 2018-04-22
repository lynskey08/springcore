package com.gareth.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//parent interface
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Hospital hos = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital Name: "+hos.getName());
		System.out.println("Departments: "+hos.getDepartments());
	}

}
