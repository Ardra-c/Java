package com.kod.dsa.sortingalgos;

public class InsertionAlgos {
		public static int[] insert(int arr[]) {
			for(int i=1;i<=arr.length-1;i++) {
				int j=i-1;
				int item=arr[i];
				while(j>=0 && arr[j]>item) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=item;
			}
			return arr;
		}
}
