package com.infinte.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
	public static void main(String[] args) {
		List<Employ> employList=new ArrayList<Employ>();
		employList.add(new Employ(1,"Yeshu",90897));
		employList.add(new Employ(2,"Yeshwanth",88297));
		employList.add(new Employ(3,"Yesh",898932));
		employList.add(new Employ(4,"Yeshk",899397));
		
		Stream<Employ> employFilter=employList.stream().filter(x-> x.getBasic()>=90000);
		System.out.println("Filtered Data: ");
		employFilter.forEach(System.out::println);
	}


}
