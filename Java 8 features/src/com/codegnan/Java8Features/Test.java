package com.codegnan.Java8Features;

interface interf{ // functional interface
	public void methodOne();
}
interface interf2{
	public void sum(int a, int b);
}

public class Test {

	public static void main(String[] args) {
		interf i = () -> System.out.println("MethodOneExecution");// lambda Expression
		i.methodOne();
		interf2 ii =(a,b) -> System.out.println(a+b); //
		ii.sum(10, 20);
		}
	}

