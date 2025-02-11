package com.codegnan.opps;

public class Encapsulation {
	private int age;
	private String name;
	
	public Encapsulation(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation(15,"srinu");
		e.setAge(16);
		e.setName("SrinivasaReddy");
		System.out.println(e.getAge());
		System.out.println(e.getName());

	}

}
