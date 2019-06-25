package com.example.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.annotation.DogCoach;

public class MyJava {
	public static void main(String Srgs[]) {
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(myCoach.getDailyWorkOut());
		System.out.println(myCoach.getDailyFortune());
		context.close();
	}

}
