 package org.mine;
//polymorphism
//method overloading
//same class,same methods, different arguements
//arguments-data type
public class Mine {
		public void myId(String id) {
			System.out.println("my id is"+id);
			
		}
		public void myNumber(long number) {
			System.out.println("my number is"+number);
		}
		public static void main(String[] args) {
			Mine m=new Mine();
			m.myId("vv6576");
			m.myNumber(7654987249l);
		}
}