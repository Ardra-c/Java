package com.kod.dsa.list.listbasedimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add("Ardra");
		al.add("Aru");
		al.add(3.45f);
		al.add(true);
		System.out.println(al);
		System.out.println("=========================");
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add("Ardra");
		ll.add("Aru");
		ll.add(3.45f);
		ll.add(true);
		System.out.println(ll);
		System.out.println("=========================");
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("=========================");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()==true) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("=========================");
		
		for(Object o:al) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println("=========================");
		
	}

}
