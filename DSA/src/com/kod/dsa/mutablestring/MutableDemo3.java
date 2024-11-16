package com.kod.dsa.mutablestring;

public class MutableDemo3 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.isEmpty());
		sb.append("Hello how are You");
		System.out.println(sb.isEmpty());
		System.out.println(sb.charAt(4));
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println("====================");
		String s="Raja Ram Mohan Roy";
		StringBuffer sb1=new StringBuffer(s);
		System.out.println(sb1);
		System.out.println(sb1.reverse());

	}

}
