package com.infinte.jdk;
@FunctionalInterface
interface IConvert{
	double convert(double c);
}


public class FunctionInterface1 {

	
			public static void main(String[] args) {
				IConvert obj1=(c)->{
					return c+273;
				};
				System.out.println("Kelvin is : "+obj1.convert(32));
			}
}
