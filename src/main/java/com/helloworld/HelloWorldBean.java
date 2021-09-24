package com.helloworld;

import org.springframework.stereotype.Service;

@Service("helloworldbean")
public class HelloWorldBean {
	private String name;
	 
	public void setName(String name) {
	this.name = name;
	}
	 
	public String sayHello() {
	return "Hello! " + name;
	}
}
