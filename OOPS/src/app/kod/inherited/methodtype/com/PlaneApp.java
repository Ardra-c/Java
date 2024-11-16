package app.kod.inherited.methodtype.com;

public class PlaneApp {

	public static void main(String[] args) {
		Plane ref;
		ref=new Cargoplane();
		ref.takeOff();
		ref.fly();
		ref.land();
		((Cargoplane)ref).carrycargo();
		
		ref=new Passengerplane();
		ref.takeOff();
		ref.fly();
		ref.land();
		((Passengerplane)ref).carrypassenger();
		
		ref=new Fighterplane();
		ref.takeOff();
		ref.fly();
		ref.land();
		((Fighterplane)ref).carryArms();
	}

}
