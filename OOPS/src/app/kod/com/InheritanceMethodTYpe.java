package app.kod.com;

public class InheritanceMethodTYpe {

	public static void main(String[] args) {
		PhysicsTeacher p=new PhysicsTeacher();
		p.teach();
		p.doExperiment();
		ChemistryTeacher c=new ChemistryTeacher();
		c.teach();
		c.doExperiment();
		BiologyTeacher b=new BiologyTeacher();
		b.teach();
		b.doExperiment();
		
		

	}

}
