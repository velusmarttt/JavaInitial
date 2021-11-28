package org.bank;
//child class
public class BankInfo extends Client {
	public static void main(String[] args) {
		BankInfo Bank=new BankInfo();
		Bank.saving();
		Bank.fixed();
		Bank.clientName();
		
	}
	private void saving() {
		System.out.println("saving is a good habit");
	}
	private void fixed() {
		System.out.println("it will give interest");
	}
}
	class Client{
		//parent class
		public void clientName() {
			System.out.println("vengat");
		}
	}
