package com.example.hankerrankexample;

import java.util.Scanner;

public class DataTypesExample1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int N = scanner.nextInt();
		for(int i =0; i<N; i++) {
			try {
				long input = scanner.nextLong();
				System.out.println(input + " can be fitted in :");
				if(input >= -128 && input <= 127) System.out.println("* byte");
				if(input >= -32768 && input <= 32767) System.out.println("* short");
				if(input >= Math.pow(-2, 31) && input <= Math.pow(2, 31) - 1) System.out.println("* int");
				if(input >= Math.pow(-2, 63) && input <= Math.pow(2, 63) - 1) System.out.println("* long");
			} catch(Exception e) {
				System.out.println(scanner.next() + " can't be fitted anywhere");
			}  
		}
		scanner.close();
	}
}
