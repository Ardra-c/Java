package oops.com.kod.abstraction;

public class CargoPlane extends Plane {

	@Override
	void takeoff() {
		System.out.println("Cargoplane is takingoff");
	}

	@Override
	void fly() {
		System.out.println("Cargoplane is flying");

	}

	@Override
	void land() {
		System.out.println("Cargoplane is landing");

	}

}
