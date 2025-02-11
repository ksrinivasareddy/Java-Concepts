package pattrenprograms;

import java.util.Scanner;

public class FullStarSquare {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n = s.nextInt();*/
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 26; j++) {
				if (i ==1 || j == 1 || i == 10 || j == 26) {
				System.out.print("*-  ");
				}
				else {
					// ascci values conversions.
					System.out.print((char)(97+ j)+"   ");
				}
			}
			System.out.println();
		}
		
	}

}
