package org.company;
	//child class
public class Company extends Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company Comp=new Company();
		Comp.companyName();
		Comp.clientName();
		
		

	}
	private void companyName() {
		System.out.println("jkr enterprises");
	}

}
    class Client{
    //parent class
    	public void clientName(){
    		System.out.println("dinesh kumar");
    	}
    	
    }
