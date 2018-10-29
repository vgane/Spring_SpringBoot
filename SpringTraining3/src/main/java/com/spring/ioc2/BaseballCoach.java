package com.spring.ioc2;

public class BaseballCoach implements Coach {
	
	//define a private feild for the dependency
	
	
	public FortuneService fortuneService; 
	
	
	//define a constructor for the dependency injection
	
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService=thefortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min batting";
	
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
		}
}
