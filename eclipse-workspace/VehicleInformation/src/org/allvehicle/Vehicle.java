//project:vehicle information
package org.allvehicle;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle Vehi=new Vehicle();
		Vehi.vehicleNecessary();
		
		TwoWheeler Two=new TwoWheeler();
		Two.bike();
		Two.cycle();
		
		ThreeWheeler Three=new ThreeWheeler();
		Three.auto();
		
		FourWheeler Four=new FourWheeler();
		Four.car();
		Four.bus();
		Four.lorry();
			
		
		
		
	}
	private void vehicleNecessary() {
		System.out.println("vehicle is compulsory nowadays");
	}
}
	class TwoWheeler{
		public static void main(String[] args) {
			TwoWheeler Two=new TwoWheeler();
			Two.bike();
			Two.cycle();
			
		}
		public void bike() {
			System.out.println("pulsar is good");
		}
			public void cycle() {
				System.out.println("hero cycle is much comfort");
				
			}
		}
	class ThreeWheeler{
		public static void main(String[] args) {
			ThreeWheeler Three=new ThreeWheeler();
			Three.auto();
			
		}
		public void auto() {
			System.out.println("it is good and comfort");
		}
		}
	class FourWheeler{
		public static void main(String[] args) {
			FourWheeler Four=new FourWheeler();
			
		}
		public void car() {
			System.out.println("it is safe to travel in rain");
		}
		public void bus() {
			System.out.println("easy to travel in long distance");
	}
		public void lorry() {
			System.out.println("it can carry heavy loads");
			
		}
		}
	
