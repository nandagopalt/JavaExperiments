package com.example.abstractfactory;

public class JaguarSportsEdition extends Jaguar {

	@Override
	public void seatingCapacity() {
		System.out.println("Jaguar Sports Seating capacity is 5");	
	}

	@Override
	public void model() {
		System.out.println("Jaguar Sports Edition");
	}
}
