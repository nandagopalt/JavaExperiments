package com.example.junitexample.fixturesexample;

import junit.framework.TestCase;

public class JavaTest extends TestCase {
	protected int value1, value2;
	
	protected void setUp() {
		System.out.println("setUp Method Called !");
		value1 = 10;
		value2 = 20;	
	}
	
	protected void tearDown() {
		System.out.println("tearDown Method Called !");	
	}
	
	public void testAddPositive() {
		double result = value1 + value2;
		assertTrue(result == 30);
	}
	
	public void testAddNegative() {
		double result = value1 + value2;
		assertTrue(result == 10);
	}

}
