package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:cust.properties")
public class Customer implements Human {
	
	
	@Value("${foo.custid}")
	public int custid;
	@Value("${foo.custname}")
	public String custname;
	
 


 
 private CustomerAddress myaddress;
 
 
 @Autowired	
	public Customer( @Qualifier("home")CustomerAddress myaddress) {
	super();
	this.myaddress = myaddress;
}



	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
	 String add = myaddress.getAddress();
	 
	 return custid+custname+add;
	}
	
	

}
