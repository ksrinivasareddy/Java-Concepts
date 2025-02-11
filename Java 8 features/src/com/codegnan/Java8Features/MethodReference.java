package com.codegnan.Java8Features;

public class MethodReference {
	
	public static void m1() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		MethodReference mr = new MethodReference();
		Runnable r = MethodReference::m1;
		Thread t = new Thread(r);
		t.start();

	}

}
