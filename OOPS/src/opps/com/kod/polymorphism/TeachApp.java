package opps.com.kod.polymorphism;

public class TeachApp {

	public static void main(String[] args) {
		College c=new College();
		c.acceptTeacher(new PhysicsTeacher());
		c.acceptTeacher(new ChemistryTeacher());
		c.acceptTeacher(new BiologyTeacher());
		
		
		
		/*
		PhysicsTeacher pt=new PhysicsTeacher();
		ref=pt;
		ref.markAttendance();
		ref.teach();
		ref.doexp();
		
		ChemistryTeacher ct=new ChemistryTeacher();
		ref=ct;
		ref.markAttendance();
		ref.teach();
		ref.doexp();
		
		BiologyTeacher bt=new BiologyTeacher();
		ref=bt;
		ref.markAttendance();
		ref.teach();
		ref.doexp();
		*/
		

	}

}
