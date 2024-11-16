package com.practice.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows and column:");
		int row =scan.nextInt();
		int col=scan.nextInt();
		int arr[][]=new int[row][col];
		int arr1[][]=new int[row][col];
		int res[][]=new int[row][col];
		
		System.out.println("Arry element:");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array1 elements");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		System.out.println("2D Array:");
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
		System.out.print("]");
		System.out.println("2D Array1:");
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("]");
		

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				res[i][j]=arr[i][j]+arr1[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Resulting array:");
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("]");
		
	}

}
