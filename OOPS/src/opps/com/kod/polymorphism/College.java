package opps.com.kod.polymorphism;

public class College {
		static void acceptTeacher(Teacher ref) {
			ref.markAttendance();
			ref.teach();
			ref.doexp();
		}
}
