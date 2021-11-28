package org.bank;
//method overriding
//child class
public class AxisBank extends BankInfo {
	
	
	public void saving(int percentage) {
		System.out.println("saving percentage in 2015 is"+percentage);
	}
	
	public void fixedDeposit(boolean high ) {
		System.out.println("fixed deposit is"+high);
		super.saving(3);
		super.fixedDeposit(true);
	}
	public static void main(String[] args) {
		AxisBank Axis=new AxisBank();
		Axis.saving(4);
		Axis.fixedDeposit(true);
	}
}