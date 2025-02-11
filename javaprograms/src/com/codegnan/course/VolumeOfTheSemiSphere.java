package com.codegnan.course;

import java.util.Scanner;

public class VolumeOfTheSemiSphere {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r,vs;
		System.out.println("Enter the value of the r: ");
		r = s.nextDouble();
		
		// volume of the semi sphere = 2/3 * pi * r ^3
		vs = 0.6*3.14*r*r*r;
		System.out.println("Volume of the sphere = "+vs);
	}

}
