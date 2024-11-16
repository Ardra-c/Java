package oops.com.kod.abstraction;

public class PlaneApp {

	public static void main(String[] args) {
		AirportPlane airport = new AirportPlane();
		airport.acceptPlane(new CargoPlane());
		airport.acceptPlane(new PassengerPlane());
		airport.acceptPlane(new FighterPlane());

	}

}
