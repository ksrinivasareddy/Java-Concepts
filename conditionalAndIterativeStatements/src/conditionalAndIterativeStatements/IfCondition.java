package conditionalAndIterativeStatements;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter number:");
		int n = s.nextInt();
		
		if (n > 0) {
			System.out.print("the given number is "+n+" positive number");
		}
		else {
			System.out.print("the given number is "+n+" negative number");
		}
	}

}
