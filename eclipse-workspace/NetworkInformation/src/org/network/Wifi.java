package org.network;

public class Wifi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wifi W=new Wifi();
		W.wifiName();
		
		MobileData Mobile=new MobileData();
		Mobile.dataName();
		
		Lan L=new Lan();
		L.lanName();
		
		Wireless Wire=new Wireless();
		Wire.modamName();

	}
	private void wifiName() {
		System.out.println("ACER");
	}

}
	class MobileData{
		public static void main(String[] args) {
			MobileData Mobile=new MobileData();
			Mobile.dataName();
			
		}
		public void dataName() {
			System.out.println("wifi");
		}
	}
	class Lan{
		public static void main(String[] args) {
			Lan L=new Lan();
			L.lanName();
			
		}
		public void lanName() {
			System.out.println("hathway");
		}
	}
	class Wireless{
		public static void main(String[] args) {
			Wireless Wire=new Wireless();
			Wire.modamName();
			
		
		}
		public void modamName() {
			System.out.println("instell");
		}
	}