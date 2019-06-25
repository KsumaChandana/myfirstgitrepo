package com.example.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:custhome.properties")
public class Home implements CustomerAddress {
	
	@Value("${foo.flatnme}")
	private String flatname;
	@Value("${foo.phone}")
	private int phoneno;


	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
	
	return flatname + phoneno;
	}

}
