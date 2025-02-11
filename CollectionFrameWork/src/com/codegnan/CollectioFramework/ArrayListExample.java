package com.codegnan.CollectioFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ArrayListExample {

	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("AAA");
		c.add("BBB");
		c.add("CCC");
		c.add(34);
		System.out.println(c);
		ArrayList a = new ArrayList(c);
		System.out.println(a);
		
		ArrayList b = new ArrayList();
		b.add("banana");
		b.add("apple");
		b.add("Orange");
		b.add(null);
		b.add(45);
		b.add(new Integer(30));
		System.out.println(b);
		

	}

}
