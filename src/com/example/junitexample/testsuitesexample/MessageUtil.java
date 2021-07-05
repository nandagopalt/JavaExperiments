package com.example.junitexample.testsuitesexample;

public class MessageUtil {
	
	private String message;
	public MessageUtil(String message) {
		this.message = message;
	}
	public String  printMessage() {
		return message;
	}
	
	public String salutationMessage() {
		//System.out.println("Hi!" + message);
		return "Hi! " + message;
	}
}
