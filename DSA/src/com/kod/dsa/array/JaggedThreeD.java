package com.kod.dsa.array;

import java.util.Scanner;

public class JaggedThreeD {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of schools");
		int arr[][][]=new int[scan.nextInt()][][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter classes of school:"+i);
			arr[i]=new int[scan.nextInt()][];
			}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter students in school of "+i+" classes "+j);
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter mark od school "+i+" classes "+j+"student "+k);
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
