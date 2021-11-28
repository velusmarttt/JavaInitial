package org.phone;
//method overloading
//data type order
public class Phone {
	public void phoneInfo(String name,float height) {
		System.out.println("phone name is"+name+"\n"+"phone camera is"+height+"\n");
		
	}
	public void phoneInfo(float weight,String camera) {
		System.out.println("phone weight is"+weight+"\n"+"phone camera is"+camera+"\n");
		
	}
	public void phoneInfo(String ram, int screenlockpin) {
		System.out.println("phone ram is"+ram+"\n"+"phone screen lock pin is"+screenlockpin+"\n");
		
	}
	public void phoneInfo(int secretpin, String rom) {
		System.out.println("phone secret pin is"+secretpin+"\n"+"phone rom is"+rom+"\n");
	}
	public static void main(String[] args) {
		Phone P=new Phone();
		P.phoneInfo("realme 8",16.876f);
		P.phoneInfo(2.464f, "64 mp back camera");
		P.phoneInfo("8gb", 2438);
		P.phoneInfo(226644, "128gb");
	}
	}
 