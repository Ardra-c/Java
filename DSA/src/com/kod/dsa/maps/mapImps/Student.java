package com.kod.dsa.maps.mapImps;

public class Student {
		int id;
		String name;
		String gender;
		int mark;
		String address;
		int number;
		public Student(int id, String name, String gender, int mark, String address, int number) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.mark = mark;
			this.address = address;
			this.number = number;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getMark() {
			return mark;
		}
		public void setMark(int mark) {
			this.mark = mark;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		
		public String toString() {
			return id+" "+name+" "+gender+" "+mark+" "+address+" "+number;
			
		}
}
