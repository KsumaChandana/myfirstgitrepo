package com.example.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:custoffice.properties")

public class Office implements CustomerAddress {

	
	@Value("${foo.flatname}")
	private String flatname;
	@Value("${foo.phoneno}")
	private int phoneno;


	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
	
	return flatname+phoneno;
	}
}
