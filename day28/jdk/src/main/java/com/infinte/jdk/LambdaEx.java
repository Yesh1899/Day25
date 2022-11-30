package com.infinte.jdk;

interface Ihello{
	void sayHello();
}
public class LambdaEx {

	public static void main(String[] args) {
		Ihello obj1=()->{
			System.out.println("welcome to the training@123");
		};
		obj1.sayHello();
	}
}
