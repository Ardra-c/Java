package com.kod.dsa.mutablestring;

public class MutableDemo4 {

	public static void main(String[] args) {
		int a=22;
		String name="Ardra";
		float value=200.36f;
		char C='A';
		String formatted=String.format("My name is %s ,i am  %d years old and"
				+ " paying $%.2f money for class %c",name,a,value,C);
		System.out.println(formatted);

	}

}
