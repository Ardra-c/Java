package com.kod.dsa.sortingalgos;

public class SortingAlgos {
	public static int[] bubblesort(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				//swap
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
	

			return arr;
	}
}
