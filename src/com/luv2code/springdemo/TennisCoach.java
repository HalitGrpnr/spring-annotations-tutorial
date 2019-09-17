package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//beanID kendimiz vermezsek Spring default beanID üretiyor. classın baş harfi küçük olacak şekilde: tennisCoach
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired //field injection
	//@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*  1) Constructor Injection. 
	@Autowired	
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	/* 2) Setter Injection
	 
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	// define a setter method
	//@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
	
	// DI setter metoduyla olduğu gibi herhangi bir metodla da yapılabilir
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	*/
	
	/* 3) Field Injection
	 */
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside doMyStartupStuff method");
	}
	
	
	// define my destroy method 
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside doMyCleanupStuff method");
	}
	
	
	@Override
	public String getDailyWorkout() { 
		return "Practise for tennis";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
