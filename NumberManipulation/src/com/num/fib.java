package com.num;

public class fib {
	static void getfib(int n) {
		int fib1=0;
		int fib2=1;
		if(n==0) {
			System.out.println(fib1);
		}else if(n==1) {
			System.out.println(fib1+" "+fib2);
		}else {
			System.out.print(fib1+" "+fib2);
		}
		for(int i=3;i<=n;i++) {
		int next=fib1+fib2;
				System.out.print(" "+next);
				fib1=fib2;
				fib2=next;
		}
	}

}
