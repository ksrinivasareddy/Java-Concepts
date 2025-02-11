package conditionalAndIterativeStatements;

import java.util.Scanner;

public class Assingnment5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1. 7up:");
		System.out.println("2. Appy Fizz:");
		System.out.println("3. Thums up:");
		System.out.println("4. Sprite:");
		System.out.println("5. Limca:");
		System.out.print("enter the number between 1 to 5: ");
		int n = s.nextInt();
		switch(n) {
		
		case 1 -> System.out.println("you had choosen 7up");
		case 2 -> System.out.println("you had choosen Appy Fizz");
		case 3 -> System.out.println("you had choosen Thums Up");
		case 4 -> System.out.println("you had choosen Sprite");
		case 5 -> System.out.println("you had choosen Limca");
		default -> System.out.println("enter a valid number between 1 to 5: ");
		
			
		}
	}

}
