package Arrays.com.codegnan;

import java.util.Scanner;

public class MultplicationOfTwoMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int matrix1[][] = new int[3][3];
		int matrix2[][] = new int[3][3];
		int resultMatrix[][] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("enter the value of row [" + i +" ]: " + " and column [" + j + "] :");
				matrix1[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("enter the value of row [" + i +" ]: " + " and column [" + j + "] :");
				matrix2[i][j] = s.nextInt();
			}
		}
		
		System.out.println("print matrix1 :");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("print matrix2: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
					resultMatrix[i][j] = matrix1[i][j] * matrix2[i][j]; 
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
