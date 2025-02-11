package com.codegnan.course;
import java.util.Scanner;
class StudentDetails{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int age,id, marks;
		String name;
		char gender;
		System.out.println("Enter the id of the Student: ");
		id = s.nextInt();
		System.out.println("Enter the name of the Student: ");
		name = s.nextLine();
		System.out.println("Enter the age of the Student: ");
		age = s.nextInt();
		System.out.println("Enter the Marks of the Student: ");
		marks = s.nextInt();
		System.out.println("Enter the gender of the Student: ");
		gender = s.next().charAt(0);
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
		System.out.println(gender);
	}
}