package com.ecm.sunils.spring;

public class DemoBean implements Demo {
	
	//bean property 
	
	TestBean tb ;
	
	//o-param constructor
	
	DemoBean()
	{
		
		
		
		
	}
	
	//constructor injection 
	
	DemoBean(TestBean tb )
	{
		
		this.tb = tb;
	}
	
	
	
	
	
	
	
//setter injection 
	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	
	//override the interface method 
	@Override
	public String sayHello() {
		
		return "good morning "+tb.msg;
	}

	
	
	
	
	
	
	
}
