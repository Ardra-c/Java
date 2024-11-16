package oops.com.kod.constructor;

public class StudentCopyApp {

	public static void main(String[] args) {
		Studentcopy stu = new Studentcopy("Prahallad",22,"Male",99);
		System.out.println(stu.name+" "+stu.age+" "+stu.gender+" "+stu.marks);

		Studentcopy stucopy=new Studentcopy(stu);
		stu.name="Omkar";
		stu.age=25;
		stu.gender="male";
		stu.marks=100;
		System.out.println(stu.name+" "+stu.age+" "+stu.gender+" "+stu.marks);
		
		System.out.println(stucopy.name+" "+stucopy.age+" "+stucopy.gender+" "+stucopy.marks);
	}

}
