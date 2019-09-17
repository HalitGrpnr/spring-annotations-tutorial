package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach") 
public class FitnessCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Today is chest day!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
