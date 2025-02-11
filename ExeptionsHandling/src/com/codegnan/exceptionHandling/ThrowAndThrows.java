package com.codegnan.exceptionHandling;

public class ThrowAndThrows {

	public static void main(String[] args) {
		throw new ArithmeticException("/ by 10"){
			System.out.println(0/10);
		}

	}

}
