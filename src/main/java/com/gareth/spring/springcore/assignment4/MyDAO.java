package com.gareth.spring.springcore.assignment4;
//reading in multiple elements from a property file
public class MyDAO {
	
	private String url;
	private String userName;
	private String password;
	
	MyDAO(String url, String userName, String password){
		this.url=url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDAO [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

	
}
