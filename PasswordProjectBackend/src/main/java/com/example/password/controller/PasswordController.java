package com.example.password.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

	
	@GetMapping("/greet")
	public String greet() {
		return "this is greet";
	}
}
