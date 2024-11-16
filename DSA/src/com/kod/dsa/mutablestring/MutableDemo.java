package com.kod.dsa.mutablestring;

public class MutableDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Rama");
		System.out.println(sb);
		sb.append("Sita");
		System.out.println(sb);
		System.out.println("======================");
		StringBuilder sb1=new StringBuilder("Kodnest");
		System.out.println(sb1);
		sb1.append("Tech");
		System.out.println(sb1);

	}

}
