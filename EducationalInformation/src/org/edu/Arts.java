package org.edu;

public class Arts {
	public void bsc() {
		System.out.println("bachelor of science");
	}
	public void bEd() {
		System.out.println("bachelor of education");
	}
}
	class Engineering extends Arts{
		public void bE() {
			System.out.println("bachelor of engineering");
		}
	public void bTech() {
		System.out.println("bachelor of technology");
	}
	}
	class Medicine extends Engineering{
		public void physiyo() {
			System.out.println("it is one of the vice treatment");
			
		}
	public void dental() {
		System.out.println("nowadays more clinic is there for dental");
	}
}
	class Education extends Medicine{
		private void ug() {
			System.out.println("under graduate");
		}
	private void pg() {
		System.out.println("post graduate");
	}
	public static void main(String[] args) {
		
	
		Education Edu=new Education();
		Edu.ug();
		Edu.pg();
		Edu.bsc();
		Edu.bEd();
		Edu.bE();
		Edu.bTech();
		Edu.physiyo();
		Edu.dental();
	}
	}
		
		
			
	
	
	