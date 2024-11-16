package app.kod.com;

public class PlaneApp {

	public static void main(String[] args) {
		cargoplanes c=new cargoplanes();
		c.takeOff();
		c.fly();
		Passengerplane p=new Passengerplane();
		p.takeOff();
		p.fly();
		FighterPlane f=new FighterPlane();
		f.takeOff();
		f.fly();

	}

}
