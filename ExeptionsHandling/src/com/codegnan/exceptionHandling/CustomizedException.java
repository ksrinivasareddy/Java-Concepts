package com.codegnan.exceptionHandling;

class TooYoungException extends Exception{
	public TooYoungException(String message) {
		super(message);
	}
}
class TooOldException extends Exception {
	public TooOldException(String message) {
		super(message);
	}
	
}
public class CustomizedException {
	public void checkEligibility(int age) throws TooYoungException, TooOldException {
		if ( age < 18) {
			throw new TooYoungException("Marriage can not be approved for your age below 18 y");
		}
		else if (age > 60) {
			throw new TooOldException("Your age is crossed the marriage age.");
		}
		else {
			System.out.println("Marriage approved. details will be processed soon.");
		}
	}

	public static void main(String[] args) {
		CustomizedException e = new CustomizedException();
		try {
			e.checkEligibility(16);
		} catch (TooYoungException | TooOldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
