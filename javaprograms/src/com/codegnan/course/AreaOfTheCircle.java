package com.codegnan.course;
import java.util.Scanner;
public class AreaOfTheCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r,t;
		System.out.print("Enter the Radius of the circle: ");
		r = s.nextDouble();
		
		// area of the circle = pi * r^2
		
		t = 3.14*r*r;
		System.out.println("Area of the circle is: "+""+t);

	}

}
