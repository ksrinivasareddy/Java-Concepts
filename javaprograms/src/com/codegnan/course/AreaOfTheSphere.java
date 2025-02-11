package com.codegnan.course;

import java.util.Scanner;

public class AreaOfTheSphere {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double as,r;
		System.out.print("enter the r value: ");
		r = s.nextDouble();
		
		// area of the sphere = 4 * pi * r ^ 2
		as = 4*3.14*r*r;
		System.out.println("Curved Surface Area (CSA): "+" "+as);
		
	}

}
