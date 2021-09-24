package com.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloW {
	
	public static void main(String[] args) {

		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext("hellobean.xml");
		HelloWorldBean service = (HelloWorldBean) context.getBean("helloWorldBean");
		
//		2nd way
		Resource resource=new ClassPathResource("hellobean.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  
		HelloWorldBean service1 = (HelloWorldBean)factory.getBean("helloWorldBean");
		
		String message = service1.sayHello();
		System.out.println(message);

		// set a new name
		service1.setName("Spring");
		message = service1.sayHello();
		System.out.println(message);
	}
}
