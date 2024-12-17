package com.kod.dsa.collections.generics;

public class Demo<T> {
		T i;
		public void setI(T i) {
			this.i=i;
		}
		public void display() {
			System.out.println(i);
		}
		public <L> void sampling(L a) {
			System.out.println(a);
		}
}
