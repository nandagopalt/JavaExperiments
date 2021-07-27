package com.example.hankerrankexample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample3 {
	public static void main(String args[]) {
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		while(n-- > 0) {
			String s1 = scanner.nextLine();
			Matcher matcher = pattern.matcher(s1);
			while(matcher.find()) {
				s1 = s1.replace(matcher.group(), matcher.group(1));
			}
			System.out.println(s1.trim());
		}
		scanner.close();
	}
}
