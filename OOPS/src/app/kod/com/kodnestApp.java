package app.kod.com;

public class kodnestApp {

	public static void main(String[] args) {
		KApp user=new KApp();
		user.name="Ardra";
		user.id=004;
		user.email="ardra@gmail.com";
		user.phone=974688;
		user.course="Java";
		user.password="abc";
		user.login();
		user.joinClass();
		user.markAttendance(13);

	}

}
