package org.all;
class Tamil{
	public void tamilLanguage() {
		System.out.println("tamil language is our mother tongue");
	}
}
class Engish extends Tamil{
	public void englishLanguage() {
		System.out.println("english language is a common language");
	}
}

 class Telugu extends Engish{
	 public void teluguLanguage() {
		 System.out.println("telugu language is one of the language in our country");
	 }
 }
		
class Languageclass extends Telugu{
	private void allLanguage() {
	System.out.println("all languages are important");	
	}
	
public static void main(String[] args) {
	Languageclass Lan=new Languageclass();
	Lan.allLanguage();
	Lan.englishLanguage();
	Lan.teluguLanguage();
	Lan.tamilLanguage();
}
} 
