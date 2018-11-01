package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach", Coach.class);
		
		//check if they are the same
		boolean result=(theCoach==alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object: "+result);
		System.out.println("\nMemory location for the theCoach: "+theCoach);
		System.out.println("\nMemory location for the alphaCoach: "+alphaCoach+"\n");
		
		//close the context
		context.close();
	}

}
