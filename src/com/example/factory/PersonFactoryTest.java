package com.example.factory;

public class PersonFactoryTest {
	public static void main(String args[]) {
		Person person1 = PersonFactory.getPerson("Male");
		person1.wish("Hi");
		Person person2 = PersonFactory.getPerson("Female");
		person2.wish("Hello");
	}
}
