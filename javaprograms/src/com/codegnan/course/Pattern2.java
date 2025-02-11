package com.codegnan.course;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String args[]) {
		int n = 3;
		int r = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= r; j++) {
				if (j == r) {
					System.out.print("* ");
				}
				else {
					System.out.print("*_ ");
				}
			}
			System.out.println();
		}
	}

}
