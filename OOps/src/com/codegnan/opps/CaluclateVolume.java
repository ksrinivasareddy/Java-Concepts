package com.codegnan.opps;

import java.util.Scanner;

abstract class shape {
	public abstract double caluclateVolume();
	public abstract double caluclateArea();
}
class Cricle extends shape {
	Scanner s = new Scanner(System.in);
	double r;
	public Cricle() {
	System.out.print("enter the radius of the circle: ");
	this.r = s.nextDouble();
	}
	public double caluclateArea() {
		return Math.PI*r*r;
	}
	public double caluclateVolume() {
		return 0;
		
	}
}

class triangle extends shape {
	Scanner s = new Scanner(System.in);
	double b,h;
	public triangle() {
		System.out.print("enter the b value: ");
		this.b = s.nextDouble();
		System.out.print("enter the h value: ");
		this.h = s.nextDouble();
	}
	public double caluclateVolume() {
		return 0;
	}
	public double caluclateArea() {
		return (0.5 *b * h);
	}
}

public class CaluclateVolume {

	public static void main(String[] args) {
		Cricle c = new Cricle();
		triangle t = new triangle();
		c.caluclateArea();
		c.caluclateVolume();
		System.out.println("circle Area " + c.caluclateArea());
		System.out.println("circle volume" + c.caluclateVolume());
		System.out.println("triangle area "+ t.caluclateArea());
		System.out.println("triangle volume"+t.caluclateVolume());
	}

}
