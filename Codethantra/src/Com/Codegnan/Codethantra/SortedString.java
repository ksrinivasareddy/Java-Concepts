package Com.Codegnan.Codethantra;

import java.util.ArrayList;
import java.util.Collections; // This should be correctly imported

import java.util.Scanner;

public class SortedString {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            String word = s.nextLine();
            if(!word.matches("[a-zA-Z]+")) {
                break;
            }
            a.add(word);
        }
        System.out.println(a);
        
        // Use Collections.sort() to sort the ArrayList
        Collections.sort(a); // Correct method call
        
        // Printing the sorted list
        System.out.println(a);
    }
}
