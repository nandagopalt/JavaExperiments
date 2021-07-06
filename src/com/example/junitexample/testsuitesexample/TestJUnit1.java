package com.example.junitexample.testsuitesexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit1 {
	String message = "Robbert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("In testPrintMessage");
		assertEquals(message, messageUtil.printMessage());
	}
}
