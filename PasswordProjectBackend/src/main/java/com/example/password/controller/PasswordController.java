package com.example.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.password.exception.PasswordException;
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
	public Response getRandomPassword(@RequestBody Model model) throws PasswordException {
		if(model.getDigit()<0 || model.getLowerCase()<0 || model.getSpecialChar()<0 || model.getUpperCase()<0) throw new PasswordException();
		
		else if(model.getDigit()>10 || model.getLowerCase()>10 || model.getSpecialChar()>10 || model.getUpperCase()>10) throw new PasswordException();
		
		else return service.getPass(model);
	}
}
