package com.gareth.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gareth.spring.springcore.map.Customer;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		CountriesAndLanguages cl = (CountriesAndLanguages) ctx.getBean("countriesAndLangs");
		System.out.println(cl);

	}

}
