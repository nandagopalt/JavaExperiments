package com.example.adapter.weather;

public class WeatherAdapter {
	public int getWeather(int zipcode) {
		String city = null;
		if(zipcode == 12345) {
			city = "Coimbatore";
		}
		WeatherFinder finder = new WeatherFinderImpl();
		int temprature = finder.getTemprature(city);
		return temprature;
	}
}
