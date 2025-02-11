package conditionalAndIterativeStatements;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		int sum = 0;
		int temp = n;
		while(temp > 0) {
			int h = temp % 10;
			sum = sum + h;
			temp = temp / 10;
		}
		
		if(n % sum == 0) {
			System.out.println(n + " is a harshad number");
		}
		else {
			System.out.println(n + " is not a harshad number: ");
		}
		System.out.println(sum);
		
	}

}
