package com.kod.dsa.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int age[]=new int[scan.nextInt()];
		for(int i=0;i<age.length-1;i++) {
			System.out.println("Enter student age:"+i);
			age[i]=scan.nextInt();
		}
		System.out.println("Elements are:");
		for(int i=0;i<=age.length-1;i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();
		for(int x:age) {
			System.out.println(x);
		}
	}

}
