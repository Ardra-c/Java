package com.kod.dsa.array;

public class MainmethodOverloading {

	public static void main(String[] args) {
		System.out.println("Hello");
		main();
		main("Ardra");
		main(3,4);
	}
	public static void main() {
		System.out.println("World");
		int arr[]= {10,20,30,40};
		main(arr);
		main(3.14f);
	}
	public static void main(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String a) {
		System.out.println(a);
	}
	public static void main(float a) {
		System.out.println(a);
	}
	public static void main(int a,int b) {
		System.out.println(a*b);
	}

}
