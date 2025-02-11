package com.codegnan.course;

import java.util.Scanner;

public class VolumeOfTheCuboid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double l,w,h,vc;
		System.out.print("Enter the length of the cuboid: ");
		l = s.nextDouble();
		System.out.print("Enter the width of the cuboid: ");
		w = s.nextDouble();
		System.out.print("Enter the height of the cuboid: ");
		h = s.nextDouble();
		
		// volume of the cuboid = l(length) * w(width) * h(height)
		vc = l*w*h;
		System.out.print("volume of the cuboid: "+vc);
	}

}
