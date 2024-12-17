package com.kod.dsa.maps.mapImps;

import java.util.*;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(100, "Ardra");
		hm.put(50, "sanvi");
		hm.put(150, "Janvi");
		hm.put(25, "nithya");
		hm.put(70, "vidu");
		hm.put(125, "abhi");
		hm.put(175, "diya");
		System.out.println("hm->"+hm);
		System.out.println("==============================");
		
		Set s1=hm.keySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("===============================");
		
		Collection c=hm.values();
		 itr=c.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("===============================");
		
		Set s2=hm.entrySet();
		itr=s2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("===============================");
	}

}
