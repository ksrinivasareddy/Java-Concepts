package com.codegnan.CollectioFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		while(true) {
			int i = s.nextInt();
			a.add(i);
			if(a.equals(10)) {
				break;
			}
			
		}
		for(int n : a) {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		}
		System.out.println(a);

	}

}
