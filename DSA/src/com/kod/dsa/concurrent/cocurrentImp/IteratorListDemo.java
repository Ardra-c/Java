package com.kod.dsa.concurrent.cocurrentImp;

import java.util.*;

public class IteratorListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet ref =new LinkedHashSet();
		ref.add(100);
		ref.add(50);
		ref.add(150);
		ref.add(25);
		ref.add(75);
		ref.add(120);
		ref.add(175);
		System.out.println(ref);
		System.out.println("======================");
		System.out.println("Iterator: ");
		Iterator itr=ref.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("=====================");
		System.out.println("List Iterator: ");
		ListIterator litr=ref.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		System.out.println("=====================");
		
		System.out.println("Reverse List Iterator: ");
		ListIterator ritr=ref.listIterator();
		while(litr.hasPrevious()) {
			System.out.print(litr.previous()+" ");
		}
		System.out.println();
		System.out.println("=====================");
		
		System.out.println("Descending Iterator: ");
		Iterator itr1=ref.descendingIterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		System.out.println();
		System.out.println("=====================");

	}

}
