package com.codegnan.course;

import java.util.Scanner;

public class AreaOfTheSemiSphere {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double r,csa,tsa;
		System.out.print("Enter the value of r: ");
		r = s.nextDouble();
		
		// curved surface area = 2 * pi * r^2
		csa = 2*3.14*r*r;
		
		// total surface area = 3 * pi * r^2
		tsa = 3*3.14*r*r;
		System.out.println("Curved surface area: "+csa);
		System.out.println("total surface area: "+tsa);
	}

}
