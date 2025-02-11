package Com.Codegnan.Codethantra;

import java.util.Scanner;

class Caluclation {
	protected int num1, num2;
	public Caluclation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int addition() {
		return num1 + num2;
	}
}

class My_Caluclation extends Caluclation {
	public My_Caluclation(int num1, int num2) {
	super(num1,num2);
	}
	public int multiplication() {
		return num1*num2;
	}
}

public class SimpleCalculatorApplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		My_Caluclation c = new My_Caluclation(num1,num2);
		int sum = c.addition();
		int production = c.multiplication();
		System.out.println(sum);
		System.out.println(production);
	}

}
