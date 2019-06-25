package com.example.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:sport.properties")
public class FileCoach implements Coach {
	@Value("${foo.emailAddress}")
	
	private String emailAddress;
	
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	private Fortune myFortune;

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return myFortune.getFortune();
	}
	
	
 public String getEmailAddress() {
		return emailAddress;
	}



public String getTeam() {
		return team;
	}

public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

@PostConstruct
	 public void getRandomData() {
		 myFortune.getRandomFortune();
		 
	 }
 
 @PreDestroy
 
public void doMyCleanUp()
{
	 System.out.println(">>inside domyClewanup()");
}
}
