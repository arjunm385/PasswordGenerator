package com.example.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.password.model.Model;
import com.example.password.service.Service;

@RestController
@RequestMapping("/password")
public class PasswordController {

	@Autowired
	Service service;
	
	@GetMapping("/greet")
	public String greet() {
		return "this is greet";
	}
	
	@PostMapping("/generate")
	public String getRandomPassword(@RequestBody Model model) {
		return service.getPass(model);
	}
}
