package com.kod.dsa.collection.set.removedups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ref=new ArrayList();
		ref.add(86);
		ref.add(42);
		ref.add(23);
		ref.add(18);
		ref.add(25);
		System.out.println("ArrayList->"+ref);
		//approach-1
		TreeSet ts=new TreeSet();
		ts.addAll(ref);
		System.out.println("TreeSet->"+ts);
		//approach-2
		Collections.sort(ref);
		System.out.println("ArrayList->"+ref);
	}

}
