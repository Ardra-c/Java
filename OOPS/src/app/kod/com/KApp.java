package app.kod.com;

public class KApp {
			String name;
			int id;
			String email;
			String password;
			int phone;
			String course;
			
			void login() {
				System.out.println("Welcome "+name+" you have logged in using "+email);
			}
			void joinClass() {
				System.out.println(name+"has joined to "+course+" class");
			}
			void markAttendance(int time) {
				if(time>15) {
					System.out.println("ABSENT");
				}else {
					System.out.println("PRESENT");
				}
			}
	}

