package com.codegnan.Java8Features;

import java.util.stream.Stream;

public class ProcessingExampleUsingStreamofMethod {
	public static void main(String args[]) {
		Stream<Integer> s = Stream.of(99,9999,99999);
		s.forEach(System.out::println);
	}

}
