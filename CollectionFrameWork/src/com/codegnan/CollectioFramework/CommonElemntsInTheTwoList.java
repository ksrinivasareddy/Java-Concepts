package com.codegnan.CollectioFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElemntsInTheTwoList {
	public static List<Integer> getCommonElement(List<Integer>list1,List<Integer>list2){
		List<Integer> c = new ArrayList<>(list1);
		c.retainAll(list2);
		return c;
	}
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(2,3,4,5,6);
		List<Integer> list = getCommonElement(list1,list2);
		System.out.println(list);

	}

}
