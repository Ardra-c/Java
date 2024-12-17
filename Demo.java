package com.kod.error.intro;

public class Demo {

	public static void main(String[] args) {
		greet();
	}
	public static void greet() {
		try {
		System.out.println("Hello");
		greet();
		}catch(Error e) {
			System.out.println("StackOverflowError: Idiot..Give stopping condition");
		}
	}

}
