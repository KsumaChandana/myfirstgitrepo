package com.example.customer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.customer.Human;


public class MyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Human cust = context.getBean("customer",Human.class);
//		
//		//System.out.println(cust.getDailyWorkOut());
//		System.out.println(cust.getDetails());
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustConfig.class);
		Human cust = context.getBean("customer",Human.class);
		//System.out.println(myCoach.getDailyWorkOut());
		//System.out.println(myCoach.getDailyFortune());
		System.out.println(cust.getDetails());

		
		context.close();
	}

}
