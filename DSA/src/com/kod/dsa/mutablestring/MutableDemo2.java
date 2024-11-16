package com.kod.dsa.mutablestring;

public class MutableDemo2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Ardr is a developer");
		System.out.println(sb.capacity());
		sb.append("Ardr live in banglore");
		System.out.println(sb.capacity());
		System.out.println("==================");
		
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.capacity());
		sb1.append("Ardr is a developer");
		System.out.println(sb1.capacity());
		sb1.append("Ardr live in banglore");
		System.out.println(sb1.capacity());
		System.out.println("==================");
		
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(100);
		System.out.println(sb2.capacity());
		StringBuffer sb3=new StringBuffer(200);
		System.out.println(sb3.capacity());
		System.out.println("==================");
	}

}
