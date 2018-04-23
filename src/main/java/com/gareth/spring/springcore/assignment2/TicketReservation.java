package com.gareth.spring.springcore.assignment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	@PostConstruct
	public void initialize() {
		System.out.println("inside init..");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("inside destroy..");
	}
}
