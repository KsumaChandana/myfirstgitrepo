package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("Properties-applicationContext.xml");
		BaseBallCoach myCoach = context.getBean("myBaseBallCoach",BaseBallCoach.class);
		//System.out.println(myCoach.getDailyWorkOut());
		//System.out.println(myCoach.getDailyFortune());
		//System.out.println("the email:"+myCoach.getEmailAddress());
		//System.out.println("the team:"+myCoach.getTeam());
		BaseBallCoach myCoach1 = context.getBean("myBaseBallCoach",BaseBallCoach.class);
		boolean result=(myCoach==myCoach1);
		System.out.println("mycoach and mycoach1 are same object:"+result);
		System.out.println("mycoach memory address:"+myCoach);
		System.out.println("mycoach1 memory address"+myCoach1);
		
		context.close();

	}

}
