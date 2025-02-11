package conditionalAndIterativeStatements;

import java.util.Scanner;

public class Assingment4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("choose your number between 1 to 5: ");
		int choose = s.nextInt();
		System.out.print("enter a value: ");
		int a = s.nextInt();
		System.out.print("enter b value: ");
		int b = s.nextInt();
		switch(choose) {
		case 1 -> System.out.println("addition of numbers is "+(a+b));
		case 2 -> System.out.println("substraction of numbers is: "+(a-b));
		case 3 -> System.out.println("multiplication of numbers is "+(a*b));
		case 4 -> System.out.println("division of numbers is "+(a/b));	
		case 5 -> System.out.println("moduler division of numbers is: "+(a%b));
		default -> System.out.println("enter a valid number that between 1 to 5 ");
		}
	}
}
