package com.codegnan.opps;
abstract class MathimaticsCaluclation {
	private int c;
	private int d;
	private String name;
	public abstract int addition();
	public  int subtract() {
		return 0;
		
	}
	public abstract int multiplication();
	public  double division() {
		return 0;
	}
	public MathimaticsCaluclation(String name) {
		this.name = name;
	}
}

class Operations {
	int a , b;
	Operations(String name){
		super();
	}
	 
	public Operations() {
		this.a = 10;
		this.b = 20;
	}
	public int addition() {
		return a + b;
	}
	public int subtraction() {
		return a - b;
	}
	public int multiplication() {
		return a * b;
	}
	public int division() {
		return a / b;
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		Operations o = new Operations();
		System.out.println(o.addition());
		System.out.println(o.subtraction());
		System.out.println(o.multiplication());
		System.out.println(o.division());
		
		

	}

}
