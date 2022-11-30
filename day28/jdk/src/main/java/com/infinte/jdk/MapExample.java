package com.infinte.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Employ> employList=new ArrayList<Employ>();
		employList.add(new Employ(1,"Yeshu",90897));
		employList.add(new Employ(2,"Yeshwanth",88297));
		employList.add(new Employ(3,"Yesh",898932));
		employList.add(new Employ(4,"Yeshk",899397));
		
		List<String> mapDemo=employList.stream().map(x-> x.getName()).collect(Collectors.toList());
		System.out.println("Filtered Data: ");
		mapDemo.forEach(System.out::println);
	}

}
