package com.codegnan.exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		//System.out.println("1");
		try {
			System.out.println(0/10);
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			// clean up code.
			System.out.println("Hai");
		}

	}

}
