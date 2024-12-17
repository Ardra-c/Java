package com.kod.dsa.collections.generics;

import java.util.ArrayList;

public class CollectionGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add(100);
		al.add("Ramu");
		al.add(true);
		System.out.println(al);
		System.out.println("=========================");
		
		ArrayList<Integer> al2= new ArrayList<Integer>();
		al2.add(50);
		al2.add(25);
		//al2.add("Somu");
		System.out.println(al2);
		
	}

}
