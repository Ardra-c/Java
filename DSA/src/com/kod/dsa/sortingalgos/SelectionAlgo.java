package com.kod.dsa.sortingalgos;

public class SelectionAlgo {
		public static int[] selection(int arr[]) {
			for(int i=0;i<=arr.length-1;i++) {
				int min=arr[i];
				int pos=i;
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[j]<min) {
						min=arr[j];
						pos=j;
					}
				}
				int temp=arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
			}
			return arr;
		}
}
