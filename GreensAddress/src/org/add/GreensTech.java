package org.add;

public class GreensTech {
	private void greensInfo(String mail, long number) {
		System.out.println("greens technology mail is"+mail +"\n"+"greens number is"+number+"\n");
	System.out.println("iam from data count");
	}

		private void greensInfo(String name) {
			System.out.println("greens technology name is"+name);
			System.out.println("iam from data type");
		}
		private void greensInfo(int age) {
			System.out.println("greens technology age is"+age);
			System.out.println("iam from data type");
		}
	private void greensInfo(String address, int room ) {
		System.out.println("greens technology address is"+address+"\n"+"greens technology room no is"+room+"\n");
		System.out.println("iam from data order");
	}
		private void greensInfo(int code, String website) {
			System.out.println("greens technology code is"+code+"\n"+"greens technology website is"+website+"\n");
			System.out.println("iam from data order");
		}
	public static void main(String[] args) {
		GreensTech g=new GreensTech();
		g.greensInfo("greensomr3@gmail.com", 8947654890l);
		g.greensInfo("greens tech park");
		g.greensInfo(15);
		g.greensInfo("no.2/12 perumal stree omr", 58);
		g.greensInfo(7825,"https greens tech.com");
	}
}