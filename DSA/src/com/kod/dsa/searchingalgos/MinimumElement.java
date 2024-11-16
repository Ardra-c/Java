package com.kod.dsa.searchingalgos;

import java.util.Scanner;

public class MinimumElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input[]=scan.nextLine().split(" ");
		int arr[]=new int[input.length];
		for(int i=0;i<input.length;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		int res=minimum(arr);
		System.out.println("Minimu num: "+res);
	}
	public static int minimum(int arr[]) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[low]<arr[high]) {
				return arr[low];
			}else if(arr[mid]>=arr[low]) {
				low=mid+1;	
			}else {
				high=mid-1;
			}
		}
		
	return -1;
	}

}
