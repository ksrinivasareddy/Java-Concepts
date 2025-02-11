package Arrays.com.codegnan;

import java.util.Scanner;

public class MatrixProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int matrix[][] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("enter the value of row [" + i +"]: " + " and column [" + j + "] :");
				matrix[i][j] = s.nextInt();
			}
		}
		System.out.println("print matrix :");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				//matrix[i][j] = matrix[j][i];
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("print tranpose_matrix :");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				//matrix[i][j] = matrix[j][i];
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}

}
