package com.codegnan.operators;

public class Pattern4 {
	public static void main(String args[]) {
		int n = 5;
		int r = 10;
		for (int i =1; i <= n; i++) {
			for ( int j = 1; j <= r; j++) {
				if (i == 1 || j == 1 || j == r || i == n) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
