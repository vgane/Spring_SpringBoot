package com.spring.ioc2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext_beanlifecycle.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());		
		//check if they are same
		
		
		
		//close the context
		context.close();
		
	}

}
