package com.practice.array;

import java.util.Scanner;

public class Dem3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		int max=arr[0];
		int count=1;
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				count++;
				max=arr[i];
			}
		}
		System.out.println(count);

	}

}
