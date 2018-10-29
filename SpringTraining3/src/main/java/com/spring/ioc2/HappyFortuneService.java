package com.spring.ioc2;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day";
	}

}
