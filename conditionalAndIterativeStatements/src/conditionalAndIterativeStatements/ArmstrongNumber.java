package conditionalAndIterativeStatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int temp = number;
        int count = 0;
        
        // counts numnber of digits in a number
        while (temp > 0) {
        	temp = temp / 10;
        	count += 1;	
        }
        System.out.println(count);
        // 
        temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int digitPower = 1;
            temp /= 10;
            /* count = 3 so loop runs 3 times. here digitpower is 1 and reminder(%) of temp 
            will be multiple in loop.*/
            for (int i = 0; i < count; i++) {
                digitPower *= digit;
            }
            System.out.println(digitPower);
            sum += digitPower;
          
        }
        System.out.println(sum);
        if (sum == number)
        	System.out.println("armstrong number: ");
        else
        	System.out.println("not a armstrong number:");
	}

}