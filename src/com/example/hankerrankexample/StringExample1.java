package com.example.hankerrankexample;

import java.util.Scanner;

public class StringExample1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String firstInput = scanner.next();
		String secondInput = scanner.next();
		int firstInputLength = firstInput.length();
		int secondInputLength = secondInput.length();
		int length =  firstInputLength + secondInputLength;
		System.out.println(length);
		String result = "No";
		if(firstInput.compareTo(secondInput) == 0) {
			result = "No";
		} else if(firstInput.compareTo(secondInput) < 0) {
			result = "No";
		} else if(firstInput.compareTo(secondInput) > 0) {
			result = "Yes";
		}
		System.out.println(result);
		String firstLetterInput = firstInput.substring(0,1);
		String remainingFirstInput = firstInput.substring(1, firstInput.length());
		String firstResult = firstLetterInput.toUpperCase() + remainingFirstInput;
		String secondLetterInput = secondInput.substring(0,1);
		String remainingSecondInput = secondInput.substring(1, secondInput.length());
		String secondResult = secondLetterInput.toUpperCase() + remainingSecondInput;
		System.out.println(firstResult +  " " + secondResult);
		scanner.close();
	}
}
