package com.practice.array;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
			for(int i=count;i<=arr.length-1;i++) {
				arr[i]=0;
			}

		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
