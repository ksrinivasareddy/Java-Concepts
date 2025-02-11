package com.codegnan.course;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double p,r,t,ci;
		System.out.print("Enter the value of p: ");
		p = s.nextDouble();
		System.out.print("Enter the value of r: ");
		r = s.nextDouble();
		System.out.print("Enter the value of t: ");
		t = s.nextDouble();
		
		//compound interest = p * (1 + r/100)^t
		ci = p * Math.pow((1+(r/100)),t);
		System.out.print("compound Interest:  "+ci);		
	}

}
