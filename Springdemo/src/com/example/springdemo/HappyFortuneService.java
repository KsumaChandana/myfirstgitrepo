package com.example.springdemo;

public class HappyFortuneService implements FortuneService{
	
	//public String fortune[]= {
	
	public HappyFortuneService() {
		System.out.println("happyfortune service object");
	}
	public String getFortune() {
		return "today is lucky day";
	}

}
