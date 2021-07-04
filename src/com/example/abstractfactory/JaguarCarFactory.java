package com.example.abstractfactory;

public class JaguarCarFactory implements CarAbstractFactory {

	@Override
	public Car createCar(String type) {
		if(type.equalsIgnoreCase("Special")) {
			return new JaguarSpecial();
		} else if(type.equalsIgnoreCase("Sports")) {
			return new JaguarSportsEdition();
		}
		return null;
	}
}
