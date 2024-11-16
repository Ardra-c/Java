package com.kod.dsa.string.prg;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=scan.nextLine();
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length();j++) {
				String str1=str.substring(i,j);
//				System.out.println(str1);
				
		boolean res=isPalindrome(str1);
		int strlength=1;
		if(res==true && str1.length()>strlength) {
			System.out.println(str1);
				}
			}
		}

	}
	public static boolean isPalindrome(String sub) {
		String rev="";
		for(int i=sub.length()-1;i>=0;i--) {
			rev=rev+sub.charAt(i);
		}
		if(sub.equals(rev)) {
			return true;
		}
		return false;
	}

}
