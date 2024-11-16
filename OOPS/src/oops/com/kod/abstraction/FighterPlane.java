package oops.com.kod.abstraction;

public class FighterPlane extends Plane {

	@Override
	void takeoff() {
		System.out.println("FighterPlane is takingoff");
	}

	@Override
	void fly() {
		System.out.println("FighterPlane is flying");

	}

	@Override
	void land() {
		System.out.println("FighterPlane is landing");

	}

}