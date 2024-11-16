package opps.com.kod.polymorphism;

public class ChemistryTeacher extends Teacher {
	void markAttendance() {
		System.out.println("Chemistry Teacher marked Attendance");
	}
	void teach() {
		System.out.println("Chemistry Teacher teaching Chemistry");
	}
	void doexp() {
		System.out.println("Chemistry Teacher doing Chemical exp");
	}
}
