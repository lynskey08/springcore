package com.gareth.spring.springcore.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//parent interface
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gareth/spring/springcore/assignment2/config.xml");
		TicketReservation tr = (TicketReservation) ctx.getBean("ticket");
		System.out.println(tr);
		//method that we need to invoke on the abstract application context
		//which tells the spring container that it need to invoke the 
		//destroy methods
		ctx.registerShutdownHook();
	}

}
