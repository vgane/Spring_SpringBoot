package com.spring.ioc;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());

	}

}
