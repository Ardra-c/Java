package com.practice.array;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		int d=scan.nextInt();
		int f=scan.nextInt();
		int totalFine=0;
		boolean isEven=(d%2==0);
		for(int i:arr) {
			boolean VehicleEven=(i%2==0);
			if((isEven && !VehicleEven) ||(!isEven && VehicleEven)) {
				totalFine+=f;
			}
		}
		System.out.println(totalFine);
	}

}
