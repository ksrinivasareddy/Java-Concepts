package com.codegnan.CollectioFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add(10);
		c.add("srinu");
		c.add(55);
		System.out.println(c);
		ArrayDeque ad = new ArrayDeque(c);
		System.out.println(ad);
		

	}

}
