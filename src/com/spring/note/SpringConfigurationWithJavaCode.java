package com.spring.note;

import org.springframework.context.annotation.Bean;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.SadFortuneService;
import com.luv2code.springdemo.SwimCoach;

public class SpringConfigurationWithJavaCode {

	/*
	
	 3 ways of configuring spring container:
	 
	 1) Full XML config -> tüm ayarlamalar, bean tanımlamaları vs xml üzerinden
	 2) XML component scan -> XML'e componentleri şu packageden tara deriz. Annotationlarla scan eder.
	 3) Java Configuration Class -> No XML, pure Java code 
	 
	 
	 Java Conf:
	 @Configuration -> Configuration file olduğunu belirtir
	 @ComponentScan("com.luv2code.springdemo") -> componentleri nerede araması gerektiğini belirtir
	 
	 
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 yerine
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
	 
	 
	 beans:
	 
	 java conf file içinde bean tanımlamalarımızı yapıyoruz.
	 bu metodları yazarken metod adları beanId'ler olmalı. 
	 context'ten retrieve ederken bu isimle çağıracağız yine. spring best practise
	 
	 // define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	 
	 // get the bean from spring container
	Coach theCoach = context.getBean("swimCoach", Coach.class);
	 
	 
	 Inject Values From Property Files
	 Java Conf file
	 @PropertySource("classpath:sport.properties")
	 
	 */
}
