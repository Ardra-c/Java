package com.kod.dsa.maps.mapImps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(100, new Student(1,"Ardra","male",89,"malappuram",9878742));
		hm.put(50, new Student(2,"Ameya","Female",98,"trivandram",9876454));
		hm.put(150, new Student(3,"Aparna","male",56,"Kochi",987466));
		System.out.println("hm->"+hm);
		System.out.println("=======================================");
		
		LinkedHashMap lhm=new LinkedHashMap<>();
		lhm.put(100, new Student(1,"Srinath","male",89,"malappuram",9878742));
		lhm.put(50, new Student(2,"Ameya","Female",98,"trivandram",9876454));
		lhm.put(150, new Student(3,"bibin","male",56,"Kochi",987466));
		System.out.println("lhm->"+lhm);
		System.out.println("=====================================");
		
		TreeMap tm=new TreeMap();
		tm.put(100, new Student(1,"Srinath","male",89,"malappuram",9878742));
		tm.put(50, new Student(2,"Ameya","Female",98,"trivandram",9876454));
		tm.put(150, new Student(3,"bibin","male",56,"Kochi",987466));
		System.out.println("tm->"+tm);
		System.out.println("=======================================");
		
		TreeMap<String, Integer> tm1=new TreeMap();
		tm1.put("First", 1);
		tm1.put("Second", 2);
		tm1.put("Third", 3);
		tm1.put("Fourth", 4);
		System.out.println("tm1->"+tm1);
		System.out.println("=======================================");
		
		
	}

}
