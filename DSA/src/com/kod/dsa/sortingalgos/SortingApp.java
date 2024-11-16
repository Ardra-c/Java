package com.kod.dsa.sortingalgos;

import java.util.Scanner;

public class SortingApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		SortingAlgos sort=new SortingAlgos();
		int[] res=sort.bubblesort(arr);
		System.out.print("Sorted Array:");
		for(int i:res) {
			System.out.print(i+" ");
		}
	}

}
