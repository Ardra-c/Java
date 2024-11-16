package com.kod.dsa.array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1D length");
		int arr[][]=new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter 2D length of 1D "+i);
				arr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter ages of class "+i+" student "+j);
				arr[i][j]=scan.nextInt();
				}
		}
		System.out.println("Array:");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
	}

}
