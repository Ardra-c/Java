package oops.com.kod.abstraction;

public class AirportPlane {
	void acceptPlane(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
