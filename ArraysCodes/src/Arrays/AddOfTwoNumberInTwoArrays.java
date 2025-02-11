package Arrays;

import java.util.Arrays;

public class AddOfTwoNumberInTwoArrays {

	public static void main(String[] args) {
		int a[] = {2,4,3};
		int b[] = {5,6,4};
		int count = 0;
        int sum = 0;
        for(int i = a.length - 1; i >= 0; i--) {
            count = count*10+a[i];
        }
        for(int i = b.length - 1; i >= 0; i--) {
            sum = sum*10+b[i];
        }
        int totalSum = count + sum;
        int temp = totalSum;
        int reverse = 0;
        while(temp > 0) {
        	int remind = temp % 10;
        	reverse = reverse * 10 + remind;
        	temp /= 10;
        }
        //System.out.println(reverse);
        String s = Integer.toString(reverse);
        System.out.println(s);
        // String to charArray.
        char c[] = new char[s.length()];
        for(int i = 0; i < s.length();i++) {
        	c[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(c));
	}

}
