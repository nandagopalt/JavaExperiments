package com.example.hankerrankexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarExample1 {
		public static void main(String args[]) {
			 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			 try {
				 String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
				 int month = Integer.parseInt(firstMultipleInput[0]);
				 int day = Integer.parseInt(firstMultipleInput[1]);
				 int year = Integer.parseInt(firstMultipleInput[2]);
				 System.out.println("Year : " + year + "," +" Month : " + month  + " Date : " + day);
				 System.out.println(getDay(year, month, day));
				 bufferedReader.close();
			 } catch(IOException exception) {
				 exception.printStackTrace();
			 }
		}
		
		private static String getDay(int year, int month, int day) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month - 1);
			calendar.set(Calendar.DAY_OF_MONTH, day);
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		    return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase(Locale.getDefault());
		}
}
