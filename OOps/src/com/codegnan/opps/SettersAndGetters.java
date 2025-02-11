package com.codegnan.opps;
class add {
	private String name;
	private int age;
	
	/*public add(String name, int age) {
		this.name = name;
		this.age = age;
	}*/


	public void setName(String name, int age) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}


public class SettersAndGetters {

	public static void main(String[] args) {
		add a = new add();
		a.setName("srinu");
		a.setAge(23);
		System.out.println(a.getName() + a.getAge());
		

	}

}
