package com.example.abstractfactory;

public class MarutiCarFactory implements CarAbstractFactory {
	@Override
	public Car createCar(String type) {
		if(type.equalsIgnoreCase("Special")) {
			return new MarutiSpecial();
		} else if(type.equalsIgnoreCase("Sports")) {
			return new MarutiSportsEdition();
		}
		return null;
	}
}
