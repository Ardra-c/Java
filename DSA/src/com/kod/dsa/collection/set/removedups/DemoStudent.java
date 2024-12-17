package com.kod.dsa.collection.set.removedups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoStudent {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Student(100,"Zanu",56));
		list.add(new Student(96,"Avni",78));
		list.add(new Student(97,"Shiva",90));
		list.add(new Student(11,"Daina",68));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
