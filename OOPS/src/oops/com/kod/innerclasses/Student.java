package oops.com.kod.innerclasses;

public class Student {
		String name;
		int age;
		class Address {
			int doorNo;
			int streetNo;
			String landMark;
			String city;
			String state;
			String country;
			int pincode;
			
			public Address(int doorNo,int streetNo,String landMark,String city,String state,String country,int pincode) {
				this.doorNo=doorNo;
				this.streetNo=streetNo;
				this.landMark=landMark;
				this.city=city;
				this.state=state;
				this.country=country;
				this.pincode=pincode;
			}
			
			void displayAddress() {
				System.out.println("Door No: " +doorNo+" Street No: " +streetNo+" Landmark: " +landMark+
						" City: "+city+" State: " +state+" Country: " +country+" Pincode: " +pincode);
			}
		}
		Address address;
		
		public Student() {
			
		}
		
		public void setData(String name,int age,Address address) {
			this.name=name;
			this.age=age;
			this.address=address;
		}
		
		void printDetails() {
			System.out.println("Name: " +name);
			System.out.println("Age: " +age);
			System.out.println("Address: " );
			address.displayAddress();
		}
}
