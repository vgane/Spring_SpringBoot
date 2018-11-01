package com.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	private String [] data= {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"the journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom=new Random();
	@Override 
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		String theFortune =data[index];
		return theFortune;
		
	}
}
