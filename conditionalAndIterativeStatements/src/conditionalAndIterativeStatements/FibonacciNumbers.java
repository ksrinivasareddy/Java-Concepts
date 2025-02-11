package conditionalAndIterativeStatements;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, n;
		System.out.println("enter a value: ");
		a = s.nextInt();
		System.out.println("enter b value: ");
		b = s.nextInt();
		System.out.println("Enter the value of n for interation: ");
		n = s.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				System.out.println(i);
			} else {
				c = a + b;
				System.out.print(" " + c);
				a = b;
				b = c;
			}
		}
	}

}
