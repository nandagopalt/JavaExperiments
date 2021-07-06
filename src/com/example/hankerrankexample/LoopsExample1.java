package com.example.hankerrankexample;

import java.util.Scanner;

public class LoopsExample1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int N = scanner.nextInt();
		if(N < 2 || N > 20) {
			System.out.println("Enter the value greater than 2 and less than equal to 20");
			scanner.close();
			return;
		}
		printTable(N);	
		if(scanner != null)
			scanner.close();
	}
	
	private static void printTable(int N) {
		for(int i = 1;i <=10;  i++) {
			System.out.println(String.format("%1d x %1d = %1d", N,i,N*i));
		}
	}

}
