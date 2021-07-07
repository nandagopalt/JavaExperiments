package com.example.hankerrankexample;

import java.util.Scanner;

public class InputExample1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while(scanner.hasNext()) {
			count++;
			String input = scanner.nextLine();
			System.out.println(String.format("%d %s", count,input));
		}
		scanner.close();
	}
}