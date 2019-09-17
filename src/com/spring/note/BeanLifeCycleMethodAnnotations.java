package com.spring.note;

public class BeanLifeCycleMethodAnnotations {
	/*
		@PostConstruct and @PreDestroy 
		
		The methods can not accept any arguments. The methods should be no-arg.
		
		@PostConstruct -> bean initialization'dan sonra çalışmasını istediğimiz metod için kullanırız
		@PreDestroy  -> bean destruct'dan çalışmasını istediğimiz metod için kullanırız
		
		Java 9+ da hata alınabilir:
		Error: Eclipse is unable to import @PostConstruct or @PreDestroy
		When using Java 9 and higher, javax.annotation has been removed from its default classpath.
		That's why we Eclipse can't find it.
		
		Solution:
		Download the javax.annotation-api-1.2.jar from and add it as lib
		
		
		!!!!!!! 
		@Scope("prototype) -> Spring bu scope için @PreDestroy çalıştırmaz
	 
	 */
}
