package Com.Codegnan.Codethantra;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateNumbersUsingArrayList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		while(s.hasNextInt()) {
			numbers.add(s.nextInt());
		}
		for(int num : numbers) {
			
			System.out.print(num + " ");
		}
		System.out.println();
		ArrayList<Integer> uniqueNumbers = new ArrayList<>();
		for(int number : numbers) {
			if( !uniqueNumbers.contains(number)) {
				uniqueNumbers.add(number);
			}
		}
		for(int num : uniqueNumbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		s.close();
		
	}

}
