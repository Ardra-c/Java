package com.kod.dsa.sortingalgos;

import java.util.Scanner;

public class SelectionApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Before Sorting:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		SelectionAlgo select=new SelectionAlgo();
		int res[]=select.selection(arr);
		System.out.println("After Sorting:");
		for(int i:res) {
			System.out.print(i+" ");
		}
	}

}
