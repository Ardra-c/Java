package com.kod.dsa.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine().toLowerCase();
		String str2=scan.nextLine().toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("Ented 2 string "+str1+" and "+str2+" are not anagaram!");
		}
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		boolean flag=false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.println("Ented 2 string "+str1+" and "+str2+" are not anagaram!");
				//System.exit(0);
				//return;
				flag=true;
				break;
			}
		}
		if(flag=false)
		System.out.println("Ented 2 string "+str1+" and "+str2+" are anagaram.");
	}

}
