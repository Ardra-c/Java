package com.kod.exception.propagationOfException;

public class Demo2 {
		void call2() {
			//try {
			new Demo3().divide();
			//}catch(Exception e) {
				//System.out.println("Exception caught in divide");
			//}
		}
}
