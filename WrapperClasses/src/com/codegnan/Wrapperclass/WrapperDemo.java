package com.codegnan.Wrapperclass;

public class WrapperDemo {

	public static void main(String[] args) {
		// Auto boxing
		int x = 10;// primitive data type
		Integer y = x;// Wrapper Integer
		System.out.println(y);
		
		// Auto un-boxing
		Integer c = 45;// Wrapper Integer
		int a = c;// primitive data type
		System.out.println(a);
		

	}

}
