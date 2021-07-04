package com.example.abstractfactory;

public class CarProducer {
	public static CarAbstractFactory getCarFactory(String type) {
		if(type.equalsIgnoreCase("Cute")) {
			return new MarutiCarFactory();
		} else if(type.equalsIgnoreCase("Majestic")) {
			return new JaguarCarFactory();
		}
		return null;
	}
}
