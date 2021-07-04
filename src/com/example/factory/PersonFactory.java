package com.example.factory;

public class PersonFactory {
	public static Person getPerson(String type) {
		if (type.equalsIgnoreCase("Male")) {
			return new Male();
		} else if (type.equalsIgnoreCase("Female")) {
			return new Female();
		}
		return null;
	}
}
