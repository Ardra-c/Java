package com.kod.dsa.searchingalgos;

import java.util.Scanner;

public class SeachingApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of string:");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the array contents are..");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the key to search:");
		int key=scan.nextInt();
		SearchingAlgos search=new SearchingAlgos();
		int res=search.linearSearch(arr,key);
		if(res>=0){
		System.out.println("Key fount at index "+res);
		}else {
			System.out.println("KEY DOES NOT FOUND!");
		}
	}

}
