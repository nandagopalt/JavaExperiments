package com.example.template;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {		
		System.out.println("Desktop : addHardDisk");
	}

	@Override
	public void addRAM() {
		System.out.println("Desktop : addRAM");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Desktop : addKeyboard");
	}
}
