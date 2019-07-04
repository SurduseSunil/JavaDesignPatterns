package com.ecm.sunils.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

	public static void main(String[] args) {
		
		//activated application container 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("DemoCFG3.xml");  
		
		//getting spring bean object 
		
		Demo bboj = (Demo) ctx.getBean("db");
		
		//call business method 
		
		System.out.println(bboj.sayHello());
		
		
		
		
	}

}
