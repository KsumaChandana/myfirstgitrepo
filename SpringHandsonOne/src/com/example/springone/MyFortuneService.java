package com.example.springone;

import java.util.Random;

public class MyFortuneService implements FortuneService {
	
	
	public String getFortune() {
		
		 String arr[]  = {"service","fortune","layer","spring","data","random","coach","java"};
	    //String toreturn=arr[(int) (Math.random()*arr.length)];
		 Random r = new Random();
		 int rm = r.nextInt(arr.length);
		 
		return arr[rm];
		
	}

}
