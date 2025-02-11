package Com.Codegnan.Codethantra;

interface PasswordChecker {
	public String checkLength(String password);
	public String checkComplexity(String password);
}

class SimpleCheck implements PasswordChecker {
	public String checkLength(String password) {
		return password.length()+" ";
	}
}

public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
