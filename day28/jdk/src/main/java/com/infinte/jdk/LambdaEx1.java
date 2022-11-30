package com.infinte.jdk;

interface Icalc{
	int calc(int a,int b);
}
public class LambdaEx1{

	public static void main(String[] args) {
		Icalc obj1=(a,b)->{
			return a+b;

		};
		System.out.println("Sum is : "+obj1.calc(3,5));
		Icalc obj3=(a,b)->{
			return a-b;

		};
		System.out.println("Diff is : "+obj3.calc(8,5));
		Icalc obj2=(a,b)->{
			return a/b;

		};
		System.out.println("Div is : "+obj2.calc(10,5));
		Icalc obj7=(a,b)->{
			return a*b;

		};
		System.out.println("Mul is : "+obj7.calc(3,5));
	
	
	
	
	
	}
	
	
	
}
