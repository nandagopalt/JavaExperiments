package com.example.hankerrankexample;

import java.util.Scanner;

public class SplitExample1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\Z");
		String s1 = scanner.nextLine().trim();
		if(s1.length() > 0 && !s1.isEmpty() && s1.length() <= 4000000) {
		String[] s2 = s1.split("[ !,?.\\_'@]+");
		System.out.println(s2.length);
		scanner.close();
		for(int i = 0; i<s2.length; i++) { 
			System.out.println(s2[i].trim()); 
			} 
		} else {
			System.out.println(0);
			if(scanner !=null) scanner.close();
			return;
		}
	
	}
}
