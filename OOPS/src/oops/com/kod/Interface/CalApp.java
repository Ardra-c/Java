package oops.com.kod.Interface;

public class CalApp {

	public static void main(String[] args) {
		Math math=new Math();
		math.acceptCal(new CasioCal());
		math.acceptCal(new EpsonCalci());
	}

}
