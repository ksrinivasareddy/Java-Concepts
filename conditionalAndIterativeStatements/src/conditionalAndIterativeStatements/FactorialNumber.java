package conditionalAndIterativeStatements;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number:");
		int n = s.nextInt();
		int count = 1;
		for (int i =1; i <= n; i++) {
			count *=i;
		}
		System.out.println(count);
	}

}
