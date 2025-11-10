package com.yym.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@GetMapping("/Welcome")
	public String welcomePage()
	{
		String text = "Welcome to Docker";
		System.out.print("Docker welcome");
		return text;
		
	}
}
