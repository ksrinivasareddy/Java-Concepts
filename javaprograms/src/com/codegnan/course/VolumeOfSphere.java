package com.codegnan.course;
import java.util.Scanner;
public class VolumeOfSphere {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double r,sp;
		System.out.println("enter the r value: ");
		r = s.nextDouble();
		
		// volume of the sphere = 4 / 3 * pi * r ^3
		sp = 4.0/3.0*3.14*r*r*r;
		System.out.println("the volume of the sphere is: "+sp);
	}

}
