package Com.Codegnan.Codethantra;

import java.util.Scanner;

public class BookPurchasedCalculator {
	public static double calculateTotalCost(int numberOfBooks) {
		double discount = (numberOfBooks >= 21) ? 0.2 : (numberOfBooks >= 11) ? 0.15 : (numberOfBooks >= 6) ? 0.1 : 0.0;
		double totalCost = numberOfBooks * 10 * (1 - discount);
    	return totalCost;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfBooks = s.nextInt();
		BookPurchasedCalculator b = new BookPurchasedCalculator();
		double totalCost = b.calculateTotalCost(numberOfBooks);
		System.out.println(totalCost);
		s.close();
	}

}
