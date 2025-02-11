package Com.Codegnan.Codethantra;

import java.util.Arrays;
import java.util.Scanner;

public class MovesZeroToLastIndexOfTheArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the size of the Array: ");
		int n = s.nextInt();
		int ar[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("enter the value at index [" + i +"] : ");
			ar[i] = s.nextInt(); 
		}
		moveZerosToEnd(ar);

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(ar));
        s.close();
	}
		
		public static void moveZerosToEnd(int[] arr) {
			int count = 0; 

		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] != 0) {
		            arr[count++] = arr[i];
		        }
		        
		    }

		    while (count < arr.length) {
		        arr[count++] = 0;
		    
		}
		}
}
		


