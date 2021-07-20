package com.example.hankerrankexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramExample1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		//boolean status = compute(s1,s2);
		/*
		 * if(status) { System.out.println("Anagrams"); } else {
		 * System.out.println("Not Anagrams"); }
		 */
		boolean status = computeV2(s1, s2);
		if(status) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
		scanner.close();
	}
	
	private static boolean computeV2(String s1, String s2) {
		int sum = 0;
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagrams");
			return false;
		}
		for(char c = 'a';  c<='z'; c++) {
			  for(int i = 0; i<s1.length(); i++) { 
				  if(s1.charAt(i) == c) { 
					  sum++; 
				  }  
				  if(s2.charAt(i) == c) {
					  sum--;
				  }
			  }
			  if(sum != 0) {
					return false;
				}
		}
		return true;			 
	}
	
	private static boolean compute(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		for(int i = 0; i<s1.length(); i++) {
			count = 0;
			char currentCharacter =  s1.charAt(i);
			if(map.containsKey(currentCharacter)) {
				count  = map.get(currentCharacter);
			}
			++count;
			map.put(currentCharacter, count);	 
		}
		for(int j = 0;  j<s2.length(); j++) {
			char currentCharacter = s2.charAt(j);
			if(!map.containsKey(currentCharacter)) {
				return false;
			}
			int frequency = map.get(currentCharacter);
			if(frequency == 0) {
				return false;
			} else {
				map.put(currentCharacter, frequency--);
			}
		}
		/*
		 * for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		 * System.out.println("Key : " + entry.getKey() + " Value : " +
		 * entry.getValue()); }
		 */
		return true;
	}
	
	

}
