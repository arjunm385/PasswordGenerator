package com.example.password.service;

import com.example.password.model.Model;

public class ServiceImpl implements Service {

	@Override
	public String getPass(Model pass) {
		
		int size=pass.getDigit()+pass.getLowerCase()+pass.getSpecialChar()+pass.getUpperCase();
		
		StringBuilder sb=new StringBuilder();
		
		
		
		return null;
	}

}
