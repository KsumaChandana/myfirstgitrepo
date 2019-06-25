package com.example.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theCoach")
@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("fortuneClasses")
	
	private FortuneService myFortuneService;
	
	
	
	
	public TennisCoach() {
		super();
	}

	
//	@Autowired
	//constructor injection
//	public TennisCoach(FortuneService myFortuneService) {
//		super();
//		this.myFortuneService = myFortuneService;
//	}

//	@Autowired
	// custom method injection
//	public void setMyFortune(FortuneService myFortuneService) {
//		this.myFortuneService = myFortuneService;
//	}
//	
	

//@Autowired
	//setter injection
	//public void setMyFortuneService(@Qualifier("fortuneClass")FortuneService myFortuneService) {
		//this.myFortuneService = myFortuneService;
	//}


	public String getDailyWorkOut() {
		return "practice back hand today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}
	
	@PostConstruct
	public void doSomeintistuff() {
		System.out.println("the init class");
	}
	
	@PreDestroy
	public void doSomecleanupStuff() {
		System.out.println("the destroy class");
	}


	
}
