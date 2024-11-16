package com.practice;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=sc.nextInt();
        int digitSum=singleSum(n);
        int result=digitSum*r;
        int singleDigitResult=reduceToSingleDigit(result);
        System.out.println(singleDigitResult);
	}
	public static int singleSum(int n) {
        int sum=0;
        while(n!=0){
        	int digit=n%10;
        	sum+=digit;
        	n=n/10;
        }
        return sum;
	}
	
	private static int reduceToSingleDigit(int num) {
		if(num>=10) {
			num=singleSum(num);
		}
		return num;
	}
}
