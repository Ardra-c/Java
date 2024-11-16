package com.practice;

import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // Factorial calculation
        long ways = 2 * factorial(N - 1);
        
        System.out.println(ways);
        sc.close();
    }

    // Method to calculate factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}