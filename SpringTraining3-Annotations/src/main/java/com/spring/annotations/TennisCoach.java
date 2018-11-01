package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //uses default bean id of "tenniscoach"
@Scope("prototype")
public class TennisCoach implements Coach{

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	//define a default constructor 
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	//define my init method
	@PostContruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach: inside of my doMyStartupStuff()");
	}
	
	//define my destroy method
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach: inside of doMyCleanupStuff()");
	}
	
	//define a setter a method
		/*@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService()");
		fortuneService=theFortuneService;
	}

	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
	@Override
	public String getDailyWorkout() {
		return "hit balls";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
