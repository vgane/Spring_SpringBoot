package com.spring.ioc2;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "run 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it: "+ fortuneService.getFortune();
	}
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	//add a destroy method
	public void doMyCleanUp() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}

}
