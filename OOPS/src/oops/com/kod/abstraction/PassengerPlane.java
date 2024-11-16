package oops.com.kod.abstraction;

public class PassengerPlane extends Plane {

	@Override
	void takeoff() {
		System.out.println("PassengerPlane is takingoff");
	}

	@Override
	void fly() {
		System.out.println("PassengerPlane is flying");

	}

	@Override
	void land() {
		System.out.println("PassengerPlane is landing");

	}

}