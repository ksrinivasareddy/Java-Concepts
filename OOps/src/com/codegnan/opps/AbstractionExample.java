package com.codegnan.opps;
abstract class Main {
	public abstract void display();
	public abstract void display1();
}

public class AbstractionExample extends Main {
	public void display() {
		System.out.println("Hai");
	}
	public void display1() {
		System.out.println("Good Morning: ");
	}

	public static void main(String[] args) {
		AbstractionExample a = new AbstractionExample();
		a.display();
		a.display1();

	}

}
