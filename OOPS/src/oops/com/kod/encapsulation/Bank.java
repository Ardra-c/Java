package oops.com.kod.encapsulation;

public class Bank {
		private String accNo;
		private String pwd;
		private double balance;
		
		public String getAccno() {
			return accNo;
		}
		
		public String getpwd() {
			return pwd;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public Bank(String accNo,String pwd,double balance) {
			this.accNo=accNo;
			this.pwd=pwd;
			this.balance=balance;
		}
		
}
