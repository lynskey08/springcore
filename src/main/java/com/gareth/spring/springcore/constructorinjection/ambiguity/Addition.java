package com.gareth.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	//this is an example of the ambiguity problem
	Addition(int a, double b){
		System.out.println("Inside the constructor");
		System.out.println(a);
		System.out.println(b);
	}
}
