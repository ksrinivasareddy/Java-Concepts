package com.codegnan.opps;

class superClass {
	public void display() {
		System.out.println("Hello:");
	}
}

class SubClass {
	public void display() {
		System.out.println("Good morning: ");
	}
}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass();
		s.display();
		

	}

}
