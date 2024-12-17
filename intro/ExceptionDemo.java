package com.kod.exception.intro;

import java.util.Scanner;

public class ExceptionDemo {

	private static int size;

	public static void main(String[] args) {
		System.out.println("Connection Established");
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Result: "+c);
		System.out.println("Enter length of array:");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Array of size " +size+ " created");
		System.out.println("Enter the element and position to store");
		int ele=scan.nextInt();
		int pos=scan.nextInt();
		arr[pos]=ele;
		System.out.println("The element in position "+pos+" is "+arr[pos]);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException: / by Zero at line 14");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException: Give positive array size at line 18");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException: Give index between 0 to "+(size-1)+" at line 18");
		}
		catch(Exception e) {
			System.out.println("Some other issue don't worry we will fix it ,resource will be safe");
		}
		
		System.out.println("Connection Terminated!");
	}

}
