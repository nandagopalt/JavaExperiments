package com.example.template;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Laptop : addHardDisk");
	}

	@Override
	public void addRAM() {
		System.out.println("Laptop : addRAM");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Laptop : addKeyboard");
	}
}
