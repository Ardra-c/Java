package app.kod.com;

public class TeacherApp {

	public static void main(String[] args) {
		JavaTrainer j=new JavaTrainer();
		j.markAttendance();
		j.teach();
		SQLTrainer s=new SQLTrainer();
		s.markAttendance();
		s.teach();
		SoftSkill ss=new SoftSkill();
		ss.markAttendance();
		ss.teach();

	}

}
