package com.example.hankerrankexample;

import java.util.Scanner;

public class PalindromeStringExample {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = "";
		for(int i = s1.length()-1; i>=0;i--) {
			s2 += s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();
	}

}
