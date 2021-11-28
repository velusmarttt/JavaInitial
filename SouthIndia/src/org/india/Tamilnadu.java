package org.india;

public class Tamilnadu{
	public void tamilLanguage() {
	System.out.println("tamil language is a great language");
	}
}
	class Kerala extends Tamilnadu{
		public void malayalam() {
			System.out.println("malayalam is not a common language"); 
		}
	}
	class Andhrapradesh extends Kerala{
		public void telugu() {
			System.out.println("telugu is not official language");
		}
	}
  class India extends Andhrapradesh{
		private void india() {
			System.out.println("india is our country");
			
		}
	
	public static void main(String[] args) {
		India Ind=new India();
		Ind.india();
		Ind.malayalam();
		Ind.tamilLanguage();
		Ind.telugu();
	}
	}
	


