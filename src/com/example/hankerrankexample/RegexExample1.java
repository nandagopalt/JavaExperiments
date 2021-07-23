package com.example.hankerrankexample;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexExample1 {
	public static void main(String args[]) {
		/*
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		while(n > 0) {
			String s1 = scanner.nextLine();
			try {
				Pattern.compile(s1);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			n--;
		}
		scanner.close();
		*/
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String IP = scanner.next();
			System.out.println(IP.matches(new RegexExample2().regex));
		}
		scanner.close();
	}

}
