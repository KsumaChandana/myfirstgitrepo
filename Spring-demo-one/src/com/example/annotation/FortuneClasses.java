package com.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class FortuneClasses implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "the fortune classes call";
	}

	

}
