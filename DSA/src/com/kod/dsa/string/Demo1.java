package com.kod.dsa.string;

public class Demo1 {

	public static void main(String[] args) {
		String str1="Ardra";
		String str2="Ardra";
		
		//comparing REFERENCE
		if(str1==str2) {
			System.out.println("REFERENCE ARE EQUAL");
		}else {
			System.out.println("REFERENCE ARE UNEQUAL");
		}
		
		//comparing VALUES
		if(str2.equals(str2)) {
			System.out.println("VALUES ARE EQUAL");
		}else {
			System.out.println("VALUES ARE UNEQUAL");
		}

	}

}
