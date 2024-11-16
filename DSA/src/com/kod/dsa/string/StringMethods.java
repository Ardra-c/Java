package com.kod.dsa.string;

public class StringMethods {

	public static void main(String[] args) {
		String s="Raja Ram Mohan Roy";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.contains("Ram"));
		System.out.println(s.startsWith("R"));
		System.out.println(s.endsWith("Roy"));
		System.out.println(s.length());
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf("Mohan"));
		System.out.println(s.isEmpty());
		String s1="";
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s.isBlank());
		System.out.println(s.replace("a", "S"));
		System.out.println(s.substring(9));
		System.out.println(s.substring(9, 14));
		System.out.println(s.charAt(9));
	}

}
