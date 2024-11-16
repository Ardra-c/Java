package com.kod.dsa.array;

import java.util.Scanner;

public class Arraymax {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		System.out.print("Array: [");
		for(int i=0;i<=arr.length-1;i++) {
			if(i<arr.length-1) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.print(arr[i]);
			}
		}
		System.out.print("]");
		System.out.println();
		ArrayMaxNum arMax=new ArrayMaxNum();
		int res=arMax.maxNum(arr);
		System.out.println("Maxium number in array is:" + res);
	}

}
