package Com.Codegnan.Codethantra;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;
		int digit = String.valueOf(n).length();
		int reverse = 0;
		while(temp > 0) {
			int digits = temp % 10;
			reverse += Math.pow(digits, digit);
			temp /= 10;
		}
		if(reverse == n) {
			System.out.println("Armstrong number:");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
