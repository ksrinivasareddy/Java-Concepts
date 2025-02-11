package com.codegnan.Java8Features;
interface inter {
	default void m1() {
		System.out.println("Hello");
	}
}

public class DefaultMethods implements inter{
	public void m2() {
		System.out.println("World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethods d = new DefaultMethods();
		d.m2();
		d.m1();
	}

}
