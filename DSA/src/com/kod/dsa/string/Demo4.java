package com.kod.dsa.string;

public class Demo4 {

	public static void main(String[] args) {
		String s1="Ardra";
		String s2="Manoj";
		
		String str1=s1+s2;
		String str2=s1+s2;
		
		if(str1==str2) {
			System.out.println("REFERENCE ARE EQUAL");
		}else {
			System.out.println("REFERENCE ARE UNEQUAL");
		}
		
		if(str1.equals(str2)) {
			System.out.println("VALUES ARE EQUAL");
		}else {
			System.out.println("VALUES ARE UNEQUAL");
		}
		System.out.println("=========================");
		String s3="Ardra"+"Manoj";
		String s4="Ardra"+"Manoj";
		
		if(s3==s4) {
			System.out.println("REFERENCE ARE EQUAL");
		}else {
			System.out.println("REFERENCE ARE UNEQUAL");
		}
		
		if(s3.equals(s4)) {
			System.out.println("VALUES ARE EQUAL");
		}else {
			System.out.println("VALUES ARE UNEQUAL");
		}
		
	}

}
