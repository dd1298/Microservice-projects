package com.dvr.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndpoints1 {
	
	
	@RequestMapping("/mypage")
	public String myString() {
		return "First Microservice example";
	}
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Welcome : " + name;
	}
	
	@RequestMapping(path="pathvariable/{name}")
	public String sayHello2(@PathVariable String name) {
		return "Path Definitions : " + name;
	}
}
