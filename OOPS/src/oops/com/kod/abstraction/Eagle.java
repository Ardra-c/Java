package oops.com.kod.abstraction;

public abstract class Eagle extends Bird {

	@Override
	void fly() {
		System.out.println("Eagle fly high");

	}

	@Override
	void sleep() {
		System.out.println("Eagle sleep");

	}
	
	void foodHabit() {
		System.out.println("Eagle is carnivorus");
	}

}
