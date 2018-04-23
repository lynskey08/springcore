package com.gareth.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method..");
		this.id = id;
	}
	
	@PostConstruct //this marks the hi method as the init method
	public void hi() {
		System.out.println("Inside hi method..");
	}
	
	@PreDestroy //this marks the bye method as the destroy method
	public void bye() {
		System.out.println("Inside bye method..");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
