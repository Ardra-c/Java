package com.kod.dsa.collection.arrayDequeue;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		System.out.println(hs);
		System.out.println("==========================");
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(175);
		System.out.println(lhs);
	}

}
