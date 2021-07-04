package com.example.factory;

public class Female implements Person {
	
	@Override
	public void wish(String message) {
		System.out.println("Female " + message);
	}

}
