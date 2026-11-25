package com.wipro.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/restdemo")
@RestController
public class WelcomeController {

	@GetMapping
	public String sayHello() {
	return "Welcome to controler of the project";
	}
}
