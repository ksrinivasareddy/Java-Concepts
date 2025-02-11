package com.codegnan.operators;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int year;
		String result;
		System.out.print("Enter the year: ");
		year = s.nextInt();
		result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "leap Year" : "not a leap Year";
		System.out.println(result);
	}

}
