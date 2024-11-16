package com.practice.array;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
			int countZero=0,countOne=0,countTwo=0;
			for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				countZero++;
			}else if(arr[i]==1) {
				countOne++;
			}else if(arr[i]==2) {
				countTwo++;
			}
			}
			int j=0;
			while(countZero>0) {
				arr[j++]=0;
				countZero--;
			}
			while(countOne>0) {
				arr[j++]=1;
				countOne--;
			}
			while(countTwo>0) {
				arr[j++]=2;
				countTwo--;
			}
			
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		scan.close();
	}

}
