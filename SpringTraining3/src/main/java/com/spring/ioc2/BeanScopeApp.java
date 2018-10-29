package com.spring.ioc2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext_beanscope.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are same
		boolean result= (theCoach==alphaCoach);
		
		//print out results
		System.out.println("\nPointing to the same object" +result);
		System.out.println("\nMemory location for theCoach" + theCoach);
		System.out.println("\nMemory location for alphaCoach" + alphaCoach+ "\n");
		
		//close the context
		context.close();
		
	}

}
