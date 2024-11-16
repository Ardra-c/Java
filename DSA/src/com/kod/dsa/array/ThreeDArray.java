package com.kod.dsa.array;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Row Column and Depth:");
		int arr[][][]=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the Marks of school "+i+" of class "+j+" student:"+k);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array content:");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
