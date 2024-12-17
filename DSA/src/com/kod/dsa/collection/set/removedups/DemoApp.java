package com.kod.dsa.collection.set.removedups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"zain",56);
		Student s2=new Student(71,"Avni",67);
		Student s3=new Student(50,"Karthi",86);
		Student s4=new Student(99,"Lucky",78);
		List ref=new ArrayList();
		ref.add(s1);
		ref.add(s2);
		ref.add(s3);
		ref.add(s4);
		System.out.println(ref);
		ComparingClass cc=new ComparingClass();
		Collections.sort(ref, cc);
		System.out.println(ref);
	}

}
