package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they're the same
		System.out.println("\nPointing to same object: "+ (theCoach == alphaCoach));
		
		System.out.println("\nMemory location for theCoach: "+ theCoach);
		System.out.println("\nMemory location for alphaCoach: "+ alphaCoach);
		
		// close the context
		context.close();
		
	}

}
