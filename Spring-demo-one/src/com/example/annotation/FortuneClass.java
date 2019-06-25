package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FortuneClass implements FortuneService{

	
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is lucky day";
	}

}
