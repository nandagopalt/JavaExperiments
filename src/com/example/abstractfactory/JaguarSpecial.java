package com.example.abstractfactory;

public class JaguarSpecial extends Jaguar {

	@Override
	public void seatingCapacity() {
		System.out.println("Jaguar Special Seating capacity is 10");
	}

	@Override
	public void model() {
		System.out.println("Jaguar Special");
	}

}
