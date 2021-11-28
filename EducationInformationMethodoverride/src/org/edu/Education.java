package org.edu;
//child class 
//method overriding
public class Education extends Arts {
	public void ug() {
		System.out.println("ug is called under graduate");
		super.ug();
		super.pg();
	}
	public void pg() {
		System.out.println("pg is called post graduate");
	}
	public static void main(String[] args) {
		Education Edu=new Education();
		Edu.ug();
		Edu.pg();
	}
	}
