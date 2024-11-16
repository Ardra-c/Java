package opps.com.kod.polymorphism;

public class Demo1 extends Demo {
	float display() {
		System.out.println("Hello");
		int a=10;
		return a;
	}
	Tiger display1() {
		System.out.println("Astla vista");
		return new Tiger();
	}
}
