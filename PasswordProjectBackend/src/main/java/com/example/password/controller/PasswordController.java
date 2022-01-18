package com.example.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.password.model.Model;
import com.example.password.model.Response;
import com.example.password.service.Service;

@RestController
@RequestMapping("/password")
@CrossOrigin
public class PasswordController {

	@Autowired
	Service service;
	
	@PostMapping("/generate")
	public Response getRandomPassword(@RequestBody Model model) {
		System.out.println(model.toString());
		return service.getPass(model);
	}
}
