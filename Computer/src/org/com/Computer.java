package org.com;
	class Desktop extends Computer{
		//child class
		public static void main(String[] args) {
			Desktop Desk=new Desktop();
			Desk.desktopSize();
			Desk.computerModel();
		}
		public void desktopSize() {
			System.out.println("size is 350cm");
		}
		
	}
	//parent class
public class Computer {
	public void computerModel() {
	System.out.println("computer model is nitro 9th gen");
	}
}
	
