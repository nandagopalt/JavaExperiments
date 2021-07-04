package com.example.factory;
public class FactoryTest {
	private static Car car = null;
	public static void main(String args[]) throws Exception {
		Car car = CarFactory.getCarObject("Maruti");
		car.createCar();
		car = CarFactory.getCarObject("Jaguar");
		car.createCar();
	}
}
