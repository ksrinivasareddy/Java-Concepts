package com.codegnan.course;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the total balance in your ac: ");
		int total_balance = s.nextInt();
		System.out.print("enter the widthdraw amount: ");
		int widthdraw = s.nextInt();
		if (widthdraw > total_balance) {
			System.out.println("Insuficient balance "+total_balance);
		}
		else{
			int result = total_balance - widthdraw;
			System.out.println("money width draw succesfull and remaining balance = "+result);
		}
		
	}

}
