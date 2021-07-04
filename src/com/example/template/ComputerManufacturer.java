package com.example.template;

public abstract class ComputerManufacturer {
	public void buildComputer() {
		addHardDisk();
		addRAM();
		addKeyboard();
		System.out.println("Computer Manufacturing Completed !");
	}
	protected abstract void addHardDisk();
	protected abstract void addRAM();
	protected abstract void addKeyboard();
}
