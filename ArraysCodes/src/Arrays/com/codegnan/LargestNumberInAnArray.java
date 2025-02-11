package Arrays.com.codegnan;

import java.util.Scanner;

public class LargestNumberInAnArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = s.nextInt();
        System.out.println("enter the elements into array: ");
        int a[] = new int[size];
        for ( int i = 0; i < a.length;i++) {
            System.out.println("enter the element at index"+i+": ");
            a[i] = s.nextInt();
        }
        int largest = a[0];
        for(int i = 0; i < a.length;i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println(largest);

	}

}
