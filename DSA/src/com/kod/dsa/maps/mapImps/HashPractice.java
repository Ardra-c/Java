package com.kod.dsa.maps.mapImps;

import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,String> hs=new HashMap<>();
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			String name=sc.next();
			hs.put(id, name);
			System.out.println("Added: ID "+id+" -> "+name);
		}
		int idRetrive=sc.nextInt();
		if(hs.containsKey(idRetrive)) {
			System.out.println("Employee Name: "+hs.get(idRetrive));
		}else {
			System.out.println("Employee not found");
		}
		
		int idRemove=sc.nextInt();
		if(hs.containsKey(idRemove)) {
			System.out.println("Employee removed: "+hs.remove(idRemove));
		}else {
			System.out.println("Employee not found");			
		}
		
		if(hs.isEmpty()) {
			System.out.println("Employee not found");
		}else {
			for(Map.Entry<Integer, String> entry: hs.entrySet()) {
			System.out.println("ID: "+entry.getKey()+", Name: "+entry.getValue());
			}
		}

	}

}
