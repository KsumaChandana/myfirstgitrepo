package com.example.annotation;

import org.springframework.stereotype.Component;
@Component
public class DogCoach implements Coach {
 
	public String getDailyWorkOut() {
		
		return "the dog coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
