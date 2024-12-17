package com.kod.dsa.maps.mapImps;

import java.util.*;

public class WeakHashMaps {

	public static void main(String[] args) {
		
		Integer k1=new Integer(100);
		Integer k2=new Integer(200);
		Integer k3=new Integer(300);
		
		WStudent s1=new WStudent(1,"Ardra");
		WStudent s2=new WStudent(2,"janvi");
		WStudent s3=new WStudent(3,"sanvi");
		
//		HashMap hm = new HashMap();
//		hm.put(k1, s1);
//		hm.put(k2, s2);
//		hm.put(k3, s3);
//		System.out.println("hm->"+hm);
//		System.out.println("=========================");
//		
		WeakHashMap whm = new WeakHashMap();
		whm.put(k1, s1);
		whm.put(k2, s2);
		whm.put(k3, s3);
		System.out.println("whm->"+whm);
		System.out.println("=========================");
		
		k1=null;
		s1=null;
		System.gc();
		for(int i=0;i<=500;i++) {
			System.out.println(" ");
		}
		System.out.println();
		System.out.println("===========================");
		System.out.println("whm->"+whm);
		
		System.out.println("===========================");
		String key2=new String("Ramu");
		String key1=new String("Ramu");
		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put(key1, 100);
		ihm.put(key2, 100);
		System.out.println("ihm->"+ihm);
	}

}
