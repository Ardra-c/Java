package oops.com.kod.abstraction;

public abstract class Sparrow extends Bird {
	@Override
	void fly() {
		System.out.println("Sparrow is flying very low");

	}

	@Override
	void sleep() {
		System.out.println("Sparrow is sleeping");
	}
	
	void eatHabit() {
		System.out.println("Sparrow picks and eats");
	}

}
