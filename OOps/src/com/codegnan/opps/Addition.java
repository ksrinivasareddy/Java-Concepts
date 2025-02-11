package com.codegnan.opps;
interface body {
	public abstract void head();
	public abstract void middleOfBody();
}
interface InnerParts {
	public abstract void heart();
	public abstract void brain();
}
interface legs {
	public abstract void fingers();
}
class parts implements body,InnerParts,legs {
	public void head() {
		System.out.println("eye");
	}
	public void middleOfBody() {
		System.out.println("stomach");
	}
	public void brain() {
		System.out.println("Brain");
	}
	public void heart() {
		System.out.println("Heart");
	}
	public void fingers() {
		System.out.println("right leg:");
	}
}
public class Addition {

	public static void main(String[] args) {
		parts b = new parts();
		b.head();
		b.middleOfBody();
		b.brain();
		b.heart();
		b.fingers();

	}

}
