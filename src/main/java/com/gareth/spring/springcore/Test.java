package com.gareth.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//create spring container - search for the xml config on the java class
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");//bean name in config file - cast it to new employee object
		System.out.println("Employee ID: "+emp.getId());
		System.out.println("Employee Name: "+emp.getName());
	}
}