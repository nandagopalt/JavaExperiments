package com.example.hankerrankexample;

import java.util.Scanner;

public class StringExample2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int index1 = scanner.nextInt();
		int index2 = scanner.nextInt();
		String result = input.substring(index1, index2);
		System.out.println(result);
		scanner.close();
	}
}
