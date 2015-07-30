package com.hackbulgaria.programming51.week7;

public class StringUtils {
	
	public static String reverseStringWithStack(String s) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++){
			stack.push(s.charAt(i));
		}
		for(int i = 0; i <stack.size(); i++){
			result += stack.pop();
		}
	    return result + stack.peek();
	  }

	public static void main(String[] args) {
		String str = " abcd"; 
		System.out.println(reverseStringWithStack(str));

	}

}
