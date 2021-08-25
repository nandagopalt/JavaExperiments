package com.example.hankerrankexample.challenge;

import java.util.Scanner;

public class Day1Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 10;
		double d1 = 5.0;
		String s1 = "Welcome ";
		
		Scanner scanner = new Scanner(System.in);
		int i2 = scanner.nextInt();
		double d2 = scanner.nextDouble();
		String s3 = scanner.next();
		String s2 = scanner.nextLine();
		
		scanner.close();
		
		System.out.println(i1+i2);
		System.out.println(d1+d2);
		String s = s1 + s3 + s2;
		System.out.println(s);

	}

}
