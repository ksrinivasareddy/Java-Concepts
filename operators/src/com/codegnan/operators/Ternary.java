package com.codegnan.operators;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount;
		double percent;
		System.out.print("Enter the amount: ");
		amount = sc.nextInt();
		percent = (amount >= 100) ? 0.2 : (amount >= 50) ? 0.1 : 0; // percentage calcluation;
		double discount = percent * amount;  // discount amount
		double payble = amount - discount;	// final amount
		System.out.println(payble);

	}

}
