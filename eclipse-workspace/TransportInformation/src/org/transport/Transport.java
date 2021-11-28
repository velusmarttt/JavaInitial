package org.transport;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport Trans=new Transport();
		Trans.transportForm();
		
		Road R=new Road();
		R.bike();
		
	Air A=new Air();
	A.aeroPlane();
	
	Water W=new Water();
	W.boat();
			
	}
		
		private void transportForm() {
			System.out.println("it is applicable");
		}
}

	class Road{
		public static void main(String[] args) {
			Road R=new Road();
			R.bike();
			
		}
		public void bike() {
			System.out.println("hero");
		}
	}
	class Air{
		public static void main(String[] args) {
			Air A=new Air();
			A.aeroPlane();
			
		}
		public void aeroPlane() {
			System.out.println("travel in a quick time");
		}
	}
	class Water{
		public static void main(String[] args) {
			Water W=new Water();
			W.boat();
				
			}
		public void boat() {
			System.out.println("used in water");
	}
	}