  package com.example.springdemo;

public class BaseBallCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	private FortuneService myFortuneService;
	
	public BaseBallCoach(FortuneService myFortuneService) {
		this.myFortuneService=myFortuneService;
	}
	
	public BaseBallCoach() {
		super();
		System.out.println("baseball object");
	}
	
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setMyFortuneService(FortuneService myFortuneService) {
		System.out.println("setter object'");
		this.myFortuneService = myFortuneService;
	}

	public String getDailyWorkOut() {
		return "do 500 pushups daily";
	}
	
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}

}
