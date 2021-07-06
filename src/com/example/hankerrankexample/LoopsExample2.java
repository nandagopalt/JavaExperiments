package com.example.hankerrankexample;

import java.util.Scanner;

public class LoopsExample2 {
	private static Scanner scanner = null;
	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i = 0; i< number; i++)
			calculate();
	}
	
	private static void calculate() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		int result = a;
		for(int j = 0; j< n; j++) {
			result += Math.pow(2, j) * b;
			System.out.print(result + " ");
		}
		System.out.println();
	}
}
