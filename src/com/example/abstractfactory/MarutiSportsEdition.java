package com.example.abstractfactory;

public class MarutiSportsEdition extends Maruti {
	@Override
	public void seatingCapacity() {	 
		System.out.println("Maruti Sports Seating Capacity 5");
	}
	@Override
	public void model() {
		System.out.println("Maruti Sports Edition");
	}	 
}
