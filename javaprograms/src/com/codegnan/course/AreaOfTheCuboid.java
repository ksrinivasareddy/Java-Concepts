package com.codegnan.course;

import java.util.Scanner;

public class AreaOfTheCuboid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double l,w,h,ac;
		System.out.print("Enter the length of the cuboid: ");
		l = s.nextDouble();
		System.out.print("Enter the width of the cuboid: ");
		w = s.nextDouble();
		System.out.print("Enter the height of the cuboid: ");
		h = s.nextDouble();
		
		// area of the cuboid = 2 * (lw + lh + wh);
		
		ac = 2*(l*w+l*h+w*h);
		System.out.print("Area  of the cuboid: "+ac);
		
	}

}
