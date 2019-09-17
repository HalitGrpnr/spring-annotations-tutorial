package com.spring.note;

public class AutowiringAndQualifiers {
	/*  
	  we've been using autowiring where Spring was basically scanned for components
	  and it'll ask, hey does anyone implement a given Interface?
	  
	  interfacenin birden fazla implementasyonu varsa ne olacak??
	  
	  NoUniqueBeanDefinitionException verecek
	  Birden fazla implementasyon var hangisini alayım diye soracak
	  
	  
	  injection yaptığımız yerde @Qualifier("beanId") annotationu ile 
	  kullanmak istediğimiz implementasyonun beanId'sini tanımlayarak bu sorunu aşarız
	  
	  beanId/beanName default olarak Spring'de şu şekildedir:
	  If the annotation's value doesn't indicate a bean name, 
	  an appropriate name will be built based on the short name of the class (with the first letter lower-cased).
	  
	  For example:
	  HappyFortuneService --> happyFortuneService

	  However, for the special case of when BOTH the first and second characters of the class name are upper case, 
	  then the name is NOT converted.
	  
	  RESTFortuneService --> RESTFortuneService
	  
	  As always, you can give explicity names to your beans.

	  @Component("foo")
	  public class RESTFortuneService .... {
    
	  }

	  Then you can access it using the name of "foo". Nothing tricky to worry about :-)
	 
	  Consturctor injection'da @Qualifier kullanımı şu şekilde olur:
	  
	  @Autowired
      public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        
        fortuneService = theFortuneService;
      }
	 
	 */
}
