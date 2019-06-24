package com.example.springone;

public class MyGolfCoach implements Coach {
	
	private FortuneService myfortuneService;
	
	
	
	
	public MyGolfCoach() {
		super();
	}

	public MyGolfCoach(FortuneService myFortuneService) {
		
		this.myfortuneService= myFortuneService;
		
		
	}
	
	
	
	public void setMyfortuneService(FortuneService myfortuneService) {
		this.myfortuneService = myfortuneService;
	}

	public String getDailyFortune() {
		
		return myfortuneService.getFortune();
		
	}

}
