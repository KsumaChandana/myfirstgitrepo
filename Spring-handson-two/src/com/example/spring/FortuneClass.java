package com.example.spring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class FortuneClass implements Fortune{
	
	public Random r = new Random();
	public String[] str = new String[4];
	
	public int index;
	
	public String getFortune() {
		return str[index];
	}
  
	
	public void getRandomFortune() {
		// TODO Auto-generated method stub
		try{
			File fs = new File("D:\\sts workspace\\Spring-handson-two\\src\\FortuneFile");
			BufferedReader br = new BufferedReader(new FileReader(fs));
			int i=0;
			String st;
		     while((st=br.readLine())!=null)
		     {
		    	 str[i]=st;
		    	 i++;
		     }
		     index =r.nextInt(str.length);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
