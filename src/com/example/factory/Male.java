package com.example.factory;

public class Male implements Person {
	
	@Override
	public void wish(String message) {
		System.out.println("Male " + message);
	}

}
