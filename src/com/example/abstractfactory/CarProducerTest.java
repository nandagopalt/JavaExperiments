package com.example.abstractfactory;

public class CarProducerTest {

	public static void main(String args[]) {
		CarAbstractFactory factory =  CarProducer.getCarFactory("Majestic");
		Car car = factory.createCar("Special");
		car.name();
		car.model();
		car.seatingCapacity();
	}
}
