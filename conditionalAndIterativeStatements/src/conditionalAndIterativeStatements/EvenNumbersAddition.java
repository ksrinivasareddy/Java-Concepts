package conditionalAndIterativeStatements;

import java.util.Scanner;

public class EvenNumbersAddition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i =0; i <= n; i= i+2){
            count += i;
        }
        System.out.println(count);
	}

}
