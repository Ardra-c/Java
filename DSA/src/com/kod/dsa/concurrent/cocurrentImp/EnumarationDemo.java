package com.kod.dsa.concurrent.cocurrentImp;

import java.util.Enumeration;
import java.util.*;

public class EnumarationDemo {

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
		ref.add(175);
		ref.add(null);
		System.out.println(ref);
		System.out.println("======================");
//		Enumeration e=ref.elements();
//		while(e.hasMoreElements()) {
//			System.out.print(e.nextElement()+" ");
//		}
//		System.out.println();
	}

}
