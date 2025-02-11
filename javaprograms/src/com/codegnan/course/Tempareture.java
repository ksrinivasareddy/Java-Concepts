package com.codegnan.course;

import java.util.Scanner;

public class Tempareture {
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the temperature: ");
	int temp = s.nextInt();
	
	if (temp >= 10 && temp <= 20) {
		System.out.println("The temperature is cool ware swetters: ");
	}
	else {
		
	if ( temp > 20 && temp <= 30) {
		System.out.println("The temperature is normal enjoy the day:");
	}
	if(temp > 30) {
		System.out.println("the temperature is too hot ware cotton cloths: ");
	}
	
	}
}
}
