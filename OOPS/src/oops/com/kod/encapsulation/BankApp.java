package oops.com.kod.encapsulation;

public class BankApp {

	public static void main(String[] args) {
		Bank bank = new Bank("FD10000457","anc5690",1500000.0);
		System.out.println("Bank Details");
		System.out.println("Account Number: " + bank.getAccno());
		System.out.println("Account password:" + bank.getpwd());
		System.out.println("Account Balance: " + bank.getBalance());
	}

}
