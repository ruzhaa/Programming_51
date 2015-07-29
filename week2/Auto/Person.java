package com.hackbulgaria.programming51.week2;

public class Person {
	public String firstName = "";
	public String lastName = "";

	public Person() {

	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

}
