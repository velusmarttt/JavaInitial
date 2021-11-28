package org.bank;
//method overriding
//same method same arguments different class
public class BankInfo {
	//parent class
	public void saving(int percentage) {
		System.out.println("savings percentage in 2010 is"+percentage);
		
	}
	
	
	public void fixedDeposit(boolean high) {
		System.out.println("fixed deposit is"+high);
	}
}
