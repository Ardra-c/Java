package com.kod.dsa.collections.generics;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo<Integer> d = new Demo<Integer>();
		d.setI(100);
		d.display();
		
		Demo<String> d2=new Demo<String>();
		d2.setI("Ardra");
		d2.display();
		
		Demo<Boolean> d3 = new Demo<Boolean>();
		d3.setI(false);
		d3.display();
		d3.sampling("Manoj");
	}

}
