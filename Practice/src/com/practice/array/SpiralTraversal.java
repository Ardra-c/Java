package com.practice.array;

import java.util.Scanner;

public class SpiralTraversal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;i++) {
				arr[i][j]=scan.nextInt();
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
		
		

	}

}
