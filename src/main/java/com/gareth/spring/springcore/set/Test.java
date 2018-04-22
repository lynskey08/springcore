package com.gareth.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		CarDealer cd = (CarDealer) context.getBean("cardealer");
		System.out.println("Car Dealer: "+ cd.getName());
		System.out.println("Models: "+ cd.getModels());
	}

}
