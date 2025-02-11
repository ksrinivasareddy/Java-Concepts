package com.codegnan.operators;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		String ans = "";
		System.out.print("Enter the String name:");
		name = s.nextLine();
		for (int i = name.length()-1; i >= 0; i--) {
			ans += name.charAt(i);
		}
		if(ans.equals(name)) {
			System.out.println("The string is palindrome");
			
		}
		else {
			System.out.println("not a palindrome");
		}
		System.out.println(ans);
	}

}
