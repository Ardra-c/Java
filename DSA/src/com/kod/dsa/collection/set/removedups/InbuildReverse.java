package com.kod.dsa.collection.set.removedups;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InbuildReverse {

	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		al.add(100);
		al.add(100);
		al.add(100);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("========================");
		List al2=new ArrayList();
		al2.add(1000);
		al2.add(500);
		al2.add(1500);
		al2.add(250);
		al2.add(750);
		al2.add(1250);
		al2.add(1750);
		System.out.println(al2);
		Comparator c=Collections.reverseOrder();
		Collections.sort(al2,c);
		System.out.println(al2);
	}

}
