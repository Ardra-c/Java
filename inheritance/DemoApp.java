package com.kod.exception.inheritance;

public class DemoApp {
		public static void main(String[] args) {
			try {
			new Demo2().alpha();
			}catch(Exception e) {
				System.out.println("Our exception handler");
				e.printStackTrace();
			}
		}
		
}
