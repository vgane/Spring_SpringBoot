package com.spring.annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SwimJavaConfigApplication {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
			
		//get bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("teamname: " +theCoach.getTeam());
		
		//close the context
		context.close();
	}
}
