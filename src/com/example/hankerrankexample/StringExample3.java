package com.example.hankerrankexample;

import java.util.Scanner;

public class StringExample3 {
	private static String smallestSubString = "";
	private static String largestSubString = "";
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		//String s = "welcometojava";
		//int j = 3;
		int j = scanner.nextInt();
		smallestSubString = s.substring(0,j);
		largestSubString = s.substring(0,j);
		for(int i = 0; i < s.length() ; i++) {
			int l = j+i;
			if(l <= s.length()) {
				System.out.println(s.substring(i, l));
				getSmallestAndLargest(s.substring(i, l));
			}
		}
		System.out.println("Smallest String : " + smallestSubString);
		System.out.println("Largest String : " + largestSubString);
		scanner.close();
	}
	
	private static void getSmallestAndLargest(String string) {
		if(smallestSubString.compareTo(string) > 0 ) {
			smallestSubString = string;
		}
		if(largestSubString.compareTo(string) < 0 ) {
			largestSubString = string;
		}
		if(smallestSubString.compareTo(string) == 0) {
			smallestSubString = string;
		}
		if(largestSubString.compareTo(string) == 0) {
			largestSubString = string;
		}
	}
	
}
