package com.kod.dsa.collection.set.removedups;

import java.util.Comparator;

public class ComparingClass implements Comparator{


	@Override
	public int compare(Object o1, Object o2) {
		Student ref1=(Student) o1;
		Student ref2=(Student) o2;
//		if(ref1.id>ref2.id) {
//			return 1;
//		}else {
//		return -1;
//		}
//		if(ref1.mark>ref2.mark) {
//			return 1;
//		}else {
//		return -1;
//		}
		return ref1.name.compareTo(ref2.name);
	}


	
}
