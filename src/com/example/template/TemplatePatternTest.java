package com.example.template;

public class TemplatePatternTest {
	public static void main(String args[]) {
		ComputerManufacturer manufacturer = new LaptopManufacturer();
		manufacturer.buildComputer();
	}
}
