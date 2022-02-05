package com.imranmadbar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public String helloMsg() {
		System.out.println("Update Hello from Home Controller !");
		return "Hello from Home Controller !";
	}
	

	@GetMapping(value = "/")
	public String welcomeMsg() {
		System.out.println("Welcome to SpringBootJenkinsApplication");
		return "Welcome to SpringBootJenkinsApplication";
	}

}
