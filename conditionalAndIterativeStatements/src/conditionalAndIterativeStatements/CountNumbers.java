package conditionalAndIterativeStatements;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = s.nextInt();
		int sum = 0;
		int temp = n;
		while (temp > 0 ) {
			int remin = temp % 10;
			sum = sum + remin;
			temp /= 10;
		}
		System.out.println(sum);
	}

}
