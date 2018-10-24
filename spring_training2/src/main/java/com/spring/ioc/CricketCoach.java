package com.spring.ioc;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach:inside no-arg constructor");
	}
	
	//setter method for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:inside setter method-setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
	
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
