package org.practice;

public class ThisSample {
String name="";
int age=56;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisSample obj=new ThisSample();
		obj.method("Vel",32);
		obj.displayName();
		obj.pub();

	}
	
	public void method(String name,int age) {
		name=name;
		age=age;
	}
	
	public void displayName() {
		
		System.out.println("The name assigned is "+name+" and his age is "+age);
	}

	private void pub() {
		// TODO Auto-generated method stub
		System.out.println("the name for pub is "+name+" and his age is "+age);

	}
}
