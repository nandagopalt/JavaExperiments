package com.example.junitexample.testsuitesexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit2 {
	String message = "Robbert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("In testSalutationMessage");
		assertEquals("Hi! " + message, messageUtil.salutationMessage());
	}
}
