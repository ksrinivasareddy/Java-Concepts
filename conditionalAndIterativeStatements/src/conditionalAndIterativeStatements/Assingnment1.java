package conditionalAndIterativeStatements;

import java.util.Scanner;

public class Assingnment1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the marks of the student: ");
		int m = s.nextInt();
		if (m >= 80) {
			System.out.println("distinction");
		}
		else if(m >= 70 && m < 80) {
			System.out.println("1st class");
		}
		else if(m >= 60 && m <= 70) {
			System.out.println("2nd class");
		}
		else if(m >= 50 && m < 60) {
			System.out.println("3rd class");
		}
		else {
			System.out.println("Fail");
		}
	}

}
