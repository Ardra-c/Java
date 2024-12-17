package com.kod.dsa.collection.set.setImp;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println("ts->"+ts);
		System.out.println("===========================");
		System.out.println("Ceiling(45)->"+ts.ceiling(45));
		System.out.println("Higher(45)->"+ts.higher(45));
		System.out.println("Ceiling(75)->"+ts.ceiling(75));
		System.out.println("Higher(75)->"+ts.higher(75));
		System.out.println("floor(45)->"+ts.floor(45));
		System.out.println("lower(45)->"+ts.lower(45));
		System.out.println("floor(45)->"+ts.floor(75));
		System.out.println("lower(45)->"+ts.lower(75));
		System.out.println("=============================");
		System.out.println(ts.headSet(75));
		System.out.println(ts.tailSet(75));
		System.out.println(ts.subSet(50, 125));
	}

}
