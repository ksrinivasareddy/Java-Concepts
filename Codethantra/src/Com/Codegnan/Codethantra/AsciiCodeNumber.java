package Com.Codegnan.Codethantra;

import java.util.Scanner;

public class AsciiCodeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char n = s.next().charAt(0);
		int ascii = (int)n;
		System.out.println(ascii);
	}

}
