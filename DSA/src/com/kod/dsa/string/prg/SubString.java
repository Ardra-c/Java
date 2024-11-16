package com.kod.dsa.string.prg;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=scan.nextLine();
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length();j++) {
				String str1=str.substring(i,j);
				System.out.println(str1);
			}
		}
	}

}
