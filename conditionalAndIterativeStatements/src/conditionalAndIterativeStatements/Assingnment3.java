package conditionalAndIterativeStatements;

import java.util.Scanner;

public class Assingnment3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double totalBalance = 50000.00;
		
		System.out.println("Welcome to ATM: ");
		System.out.println("1. Check total balance: ");
		System.out.println("2. Deposite money(should be greater than 500): ");
		System.out.println("3. Widthdraw money(should be greater than 500): ");
		System.out.println("4. Exit: ");
		
		System.out.print("Choose number between 1 to 4: ");
		int choose = s.nextInt();
		switch(choose) {
		
		
		case 1:
			System.out.println("total amount in your account: "+ totalBalance);
			break;
			
		case 2:
			System.out.print("enter deposite money :");
			double deposite = s.nextDouble();
			if (deposite > 500 && deposite % 100 == 0) {
				totalBalance += deposite;
				System.out.println("total balance after deposite is: "+totalBalance);
			}
			else {
				System.out.println("enter the deposite amount that should be greater than 500 and also it should be multiple of 100: ");
			}
			break;
			
		case 3:
			System.out.print("enter the widthdrawmoney: ");
			double widthdrawmoney = s.nextDouble();
			if (widthdrawmoney > 500 && widthdrawmoney <= totalBalance && widthdrawmoney % 100 == 0) {
				totalBalance -= widthdrawmoney;
				System.out.println("total balance after widthdrawn money: "+totalBalance);
			}
			else {
				System.out.println("enter the amount that should be greater than 500 and also it must be multiple of 100: ");
			}
			break;
			
		case 4:
			System.out.println("exit: ");
			break;
			
		default:
			System.out.println("Invalid choose!.. please choose a valid number that should be between 1 to 4:");	
			
		
	}
		System.out.println("Thank you!. visite again");

}
}
