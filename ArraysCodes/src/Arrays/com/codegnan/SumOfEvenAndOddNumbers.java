package Arrays.com.codegnan;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size = s.nextInt();
		int a[] = new int [size];
		System.out.print("enter the elements into the array: ");
		for (int i = 0; i < size; i++) {
			System.out.println("element at index " + i + ": ");
			a[i] = s.nextInt();
		int evensum = 0;
		int oddsum = 0;
		for(int i1  = 0; i1 < a.length;i1++) {
			if (a[i1] % 2 == 0) {
				evensum += a[i1];
			}
			
			else {
				oddsum += a[i1];
			}
		}
		System.out.println(evensum);
		System.out.println(oddsum);
		
		
		}
		
		
		

	}

}
