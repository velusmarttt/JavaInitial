package org.comp;
//polymorphism
//method overloading
//same class, same methods, different arguements
//arguments-data count(no of arguements)
public class Company {
	public void companyInfo(String name, long number,int age) {
		System.out.println("company name is"+name +"\n" + "company number is"+number+"\n"+"company age is"+age);
	}
	public static void main(String[] args) {
		Company Comp=new Company();
		Comp.companyInfo("velu enterprises", 8939563479l,15);
	}

}
