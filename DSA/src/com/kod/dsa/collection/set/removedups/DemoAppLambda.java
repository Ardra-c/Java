package com.kod.dsa.collection.set.removedups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoAppLambda {

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
		Comparator cc = (Object o1,Object o2)->{
			Student ref1=(Student) o1;
			Student ref2=(Student) o2;
			if(ref1.mark>ref2.mark) {
				return 1;
			}else {
				return -1;
			}
		};
		Collections.sort(ref, cc);
		System.out.println(ref);
	}

}
