package com.example.hankerrankexample;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatterExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		String USA = format(payment, Locale.US);
		String INDIA = format(payment, new Locale("en","IN"));
		String CHINA = format(payment, Locale.CHINA);
		String FRANCE = format(payment, Locale.FRANCE);
		System.out.println("US: " + USA);
		System.out.println("India: " + INDIA);
		System.out.println("China: " + CHINA);
		System.out.println("France: "+ FRANCE);
	}
	
	private static String format(double amount, Locale locale) {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		return numberFormat.format(amount);
	}
}
