package com.example.hankerrankexample;

import java.util.Scanner;

public class OutputFormattingExample {
	public static void main(String args[]) {
		String input, formatted = null;
		int integer = 0;
		Scanner scanner = new Scanner(System.in);
		int length = 3;
		String array[] = new String[length];
		for(int i = 0; i<length; i++) {
			input = scanner.next();
			integer = scanner.nextInt();
			formatted = String.format("%-15s%03d", input, integer);
			array[i] = formatted;		
		}	
		System.out.println("================================");
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("================================");			
		scanner.close();
	}
}
