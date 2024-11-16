package com.kod.dsa.string.prg;

public class StringManipulation {

	public static String reverse(String str) {
	/*	char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		str=new String(arr2);
		return str;*/
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;

	}

}
