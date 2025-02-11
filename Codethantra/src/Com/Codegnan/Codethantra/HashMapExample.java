package Com.Codegnan.Codethantra;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
	public static boolean areAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> h = new HashMap<>();
		for(char c : str1.toCharArray()) {
			h.put(c, h.getOrDefault(c, 0)+ 1);
		}
		for(char c : str2.toCharArray()) {
			h.put(c, h.getOrDefault(c, 0) - 1);
			if(h.get(c) < 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		
		if(areAnagram(str1,str2)) {
			System.out.println(str1 + " and " + str2 + " are anagarams");
		}
		else {
			System.out.println(str1 + " and " + str2 + " are not anagarams");
		}
		
		s.close();
	}

}
