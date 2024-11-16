package com.kod.dsa.array;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length:");
		Student arr[]=new Student[scan.nextInt()];
		System.out.println("Enter id,name,gender, and marks of "+arr.length+"student");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=new Student(scan.nextInt(),scan.next(),scan.next(),scan.nextInt());
		}
		System.out.println("Array Contents:");
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].gender+" "+arr[i].marks);
		}
		System.out.print("]");
	}

}
