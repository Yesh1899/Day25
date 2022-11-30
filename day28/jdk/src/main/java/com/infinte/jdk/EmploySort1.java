package com.infinte.jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort1 {
	public static void main(String[] args) {
		List<Employ> employList=new ArrayList<Employ>();
		employList.add(new Employ(1,"Yeshu",90897));
		employList.add(new Employ(2,"Yeshwanth",88297));
		employList.add(new Employ(3,"Yesh",898932));
		employList.add(new Employ(4,"Yeshk",899397));
		Collections.sort(employList,(e1,e2)->{
			return e1.getName().compareTo(e2.getName());
		});
		System.out.println("Sort by name :  ");
		employList.forEach(System.out::println);
	}


}
