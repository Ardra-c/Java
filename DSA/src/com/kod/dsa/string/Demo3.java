package com.kod.dsa.string;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1="Ardra";
		String s2=new String("Ardra");
		String s3="ArDra";
		
		if(s1==s2) {
			System.out.println("REFERENCE ARE EQUAL");
		}else {
			System.out.println("REFERENCE ARE UNEQUAL");
		}
		
		if(s1.equals(s2)) {
			System.out.println("VALUES ARE EQUAL");
		}else {
			System.out.println("VALUES ARE UNEQUAL");
		}
		System.out.println("=========================");
		if(s1==s3) {
			System.out.println("REFERENCE ARE EQUAL");
		}else {
			System.out.println("REFERENCE ARE UNEQUAL");
		}
		
		if(s1.equals(s3)) {
			System.out.println("VALUES ARE EQUAL");
		}else {
			System.out.println("VALUES ARE UNEQUAL");
		}
		
		if(s1.equalsIgnoreCase(s3)){
			System.out.println("VALUES ARE EQUAL WHEN THE CASES ARE IGNORED");
		}else {
			System.out.println("VALUES ARE UNEQUAL WHEN THE CASES ARE NOT IGNORED");
		}
	}

}
