package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	
	private String[] data = {
		"Fortune - 1",
		"Fortune - 2",
		"Fortune - 3",
		"Fortune - 4"
	};
 	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		// pick a random string from the array
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
