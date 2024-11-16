package com.kod.dsa.array;

public class ArrayMaxNum {
		public int maxNum(int arr[]) {
			int max=arr[0];
			for(int i=1;i<=arr.length-1;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
}
