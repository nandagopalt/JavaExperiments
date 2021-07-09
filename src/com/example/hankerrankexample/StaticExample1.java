package com.example.hankerrankexample;

import java.io.IOException;
import java.util.Scanner;

public class StaticExample1 {
	private static boolean flag;
	private static int B,H;
	static  {
		flag = true;
		B = H = 0;	
		try {
			input();
		} catch (Exception e) {
		   System.out.print(e.getMessage());
		   flag = false;
		}
	}
	public static void main(String args[])  {
		if(flag) {			
			int area = B * H;
			System.out.print(area);
			}
	}
	
	public static void input() throws Exception {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		if(B <= 0 || H <= 0) {
			scanner.close();
			throw new Exception("java.lang.Exception: Breadth and height must be positive");
		}
		if(scanner != null) {
			scanner.close();
		}
		 
	}

}
