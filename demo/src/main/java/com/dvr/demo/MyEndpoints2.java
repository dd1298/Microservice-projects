package com.dvr.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndpoints2 {

	public MyEndpoints2() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retrieveAll(){
		return service.findAll();
	}
	
	//private SecondSampleBean second = new SecondSampleBean("For Oracle India");
	@GetMapping("/secondSampleBean")
	public SecondSampleBean secondSample() {
		//System.out.println(second);
		return new SecondSampleBean("For Oracle India"); 
	}

}
