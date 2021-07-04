package com.example.factory;

public class CarFactory {
	public static Car getCarObject(String type) throws Exception {
		if(type.equalsIgnoreCase("Maruti"))
			return new Maruti();
		else if(type.equalsIgnoreCase("Jaguar")) {
			return new Jaguar();
		} else throw new Exception("Please check input !"); 
	}
}
