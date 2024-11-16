package com.kod.dsa.string;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine().toLowerCase();
//		String regex="[a,e,i,o,u]+";
//		str.toLowerCase();
//		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Count of vowels: "+count);

	}

}
