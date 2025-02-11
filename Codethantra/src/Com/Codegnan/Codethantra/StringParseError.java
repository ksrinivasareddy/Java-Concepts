package Com.Codegnan.Codethantra;

import java.util.Scanner;

public class StringParseError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		try {
			double i = Double.parseDouble(n);
			System.out.println("Parsed number: " + i);
		}
		catch(NumberFormatException e) {
			System.out.println("Error: Invalid number format");
		}
		finally {
			s.close();
		}

	}

}
