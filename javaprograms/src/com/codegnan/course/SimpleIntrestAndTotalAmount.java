package com.codegnan.course;
import java.util.Scanner;

public class SimpleIntrestAndTotalAmount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double p,t,r,si,a;
		System.out.print("Enter the p value: ");
		p = s.nextDouble();
		System.out.print("Enter the r value: ");
		r = s.nextDouble();
		System.out.print("Enter the t value: ");
		t = s.nextDouble();
		
		// simple interest = (p(principle) * t(time) * r(rate)) / 100
		si = (p*t*r)/100;
		
		// total amount = p(principle) + simple interest
		a = p + si;
		System.out.println("simpleIntrest= "+" "+si);
		System.out.println("Totalamount= "+" "+a);
	}

}
