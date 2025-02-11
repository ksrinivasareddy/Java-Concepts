package com.codegnan.CollectioFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DequeueExample {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addFirst(45);
		dq.addFirst(18);
		dq.addFirst(7);
		dq.offerLast(59);
		System.out.println(dq);

	}

}
