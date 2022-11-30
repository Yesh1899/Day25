package com.infinte.jdk;

import java.util.ArrayList;
import java.util.List;

public class LambdaEmploy {
	public static void main(String[] args) {
		List<Employ> employList=new ArrayList<Employ>();
		employList.add(new Employ(1,"Yeshu",89897));
		employList.add(new Employ(2,"Yeshwanth",88297));
		employList.add(new Employ(3,"Yesh",898932));
		employList.add(new Employ(4,"Yeshk",89397));
		System.out.println("Employ List is: ");
		employList.forEach(s->{
			System.out.println(s);
		});
		employList.forEach(System.out::println);
	}

}
