package com.example.password.model;

import lombok.Data;

@Data
public class Response {
	private String res;

	public Response(String res) {
		super();
		this.res = res;
	}
	
}
