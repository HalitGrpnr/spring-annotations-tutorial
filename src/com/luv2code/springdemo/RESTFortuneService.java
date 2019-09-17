package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	
	public RESTFortuneService() {
		System.out.println(">> RESTFortuneService: inside default constructor");
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
