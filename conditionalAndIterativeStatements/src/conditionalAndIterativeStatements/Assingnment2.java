package conditionalAndIterativeStatements;
import java.util.Scanner;

public class Assingnment2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the talktime of the user: ");
		int talktime = s.nextInt();
		if (talktime > 500) {
			System.out.println("user got a unlimites plan: ");
		}
		else if(talktime >= 300 && talktime < 500 ) {
			System.out.println("user got a premium plan ");
		}
		else if (talktime >= 100 && talktime < 300) {
			System.out.println("Standed plan: ");
		}
		else {
			System.out.println("basic plan");
		}
	}

}
