package com.example.hankerrankexample;

public class RegexExample2 {
	private String number = "(\\d{1,2}|(0|1)\\"
            + "d{2}|2[0-4]\\d|25[0-5])";
	public String regex = number + "\\." + 
            				number + "\\." +
            				number + "\\." +
            				number;
            				
}
