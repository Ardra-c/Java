package com.kod.exception.propagationOfException;

public class Demo1 {
			void call1() {
				new Demo2().call2();
			}
}