package com.example.adapter.weather;

public class WeatherUI {
	 public int getTemprature(int zipcode) {
		WeatherAdapter adapter = new WeatherAdapter();
		int temprature = adapter.getWeather(zipcode);
		 return temprature;
	 }
	 
	 public static void main(String args[]) {
		 WeatherUI weatherUI = new WeatherUI();
		 System.out.println(weatherUI.getTemprature(12345));
	 }
}
