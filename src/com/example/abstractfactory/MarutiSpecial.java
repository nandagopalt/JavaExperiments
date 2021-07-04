package com.example.abstractfactory;

public class MarutiSpecial extends Maruti {
	@Override
	public void seatingCapacity() {
		System.out.println("Maruti Special Seating Capcity 5");
	}

	@Override
	public void model()  {
		System.out.println("Maruti Special");
	}

}
