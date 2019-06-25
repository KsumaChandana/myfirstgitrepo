package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.Coach;

public class MyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		FileCoach myCoach = context.getBean("fileCoach",FileCoach.class);
		
		//System.out.println(myCoach.getDailyWorkOut());
		System.out.println(myCoach.getEmailAddress());
		System.out.println(myCoach.getTeam());
		
		context.close();
	}

}
