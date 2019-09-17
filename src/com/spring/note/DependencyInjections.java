package com.spring.note;

import com.luv2code.springdemo.FortuneService;

public class DependencyInjections {
	
	/*
	 
	 @Autowired ile inject yapmak istediğimiz zaman, 
	 inject edilecek obje tipine bakıp o türü implemente etmiş bir component arıyor Spring. 
	 
	 @Autowired annotationunu görünce buraya belirtilen tipte bir şey inject edeceğini biliyor.
	  
	  
	 1) Constructor Injection:
	 	dependencyi constructorda inject eder
	 	
	 	@Autowired	
		public TennisCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
	 	
	 	
	 2) Setter Injection:
	 	dependencyi setter metodu ile inject eder. @Autowired annotationu bu metodun başında olacak 
	 	ve Spring bu şekilde anlayabilecek
	 	
	 	NOT: set metodu yerine herhangi isimde bir metodla da bu yapılabilir, @Autowired onun başına yazılarak
	 	
	 	
	 	@Autowired
		public void setFortuneService(FortuneService theFortuneService) {
			System.out.println(">> TennisCoach: inside setFortuneService() method");
			fortuneService = theFortuneService;
		}
	 	
	 3) Field Injection:
	 	herhangi bir metod yazmadan veya constructora bir parametre geçmeden doğrudan classta bulunan objeye 
	 	@Autowired ekleyerek de injection yapabiliriz.
	 	
	 	@Autowired
	 	private FortuneService theFortuneService;
	 	
	 	obje private olsa bile injection yapılıyor. arka planda java reflection yapılıyor
	 
	 
	 */
	
	
}
