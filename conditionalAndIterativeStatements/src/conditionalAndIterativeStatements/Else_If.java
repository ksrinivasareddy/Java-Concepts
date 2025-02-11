package conditionalAndIterativeStatements;

import java.util.Scanner;

public class Else_If {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your city name: ");
		String c = s.next();
		if (c.equalsIgnoreCase( "Hyderabad")) {
			System.out.println("Hello Hyderabad. adaab");
		}
		else if (c.equalsIgnoreCase("Chennai")) {
			System.out.println("Hello Chennai. vanakkam");
		}
		else if (c.equalsIgnoreCase("Benglore")) {
			System.out.println("namaskar ...");
		}
		else {
			System.out.println("none");
		}
	}

}
