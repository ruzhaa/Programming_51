package com.hackbulgaria.programming51.week3;

public class Main {

	public static void main(String[] args) {
		 IntegerVector v = new IntegerVector();
		  v = IntegerVectorStatic.range(10,20);
		  System.out.println(IntegerVectorStatic.toString(v));
	}
}
