package com.example.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springone.Coach;

public class Myjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myGolfCoach",Coach.class);
	     System.out.println(myCoach.getDailyFortune());
		context.close();	
		
		
	}

}
