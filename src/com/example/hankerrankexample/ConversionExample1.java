package com.example.hankerrankexample;

import java.util.Scanner;

public class ConversionExample1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Value of N : " + n);
		String s = String.valueOf(n);
		if(n == Integer.parseInt(s)) {
			System.out.println("Good Job");
		} else {
			System.out.println("Wrong answer");
		}
		scanner.close();
	}
}
