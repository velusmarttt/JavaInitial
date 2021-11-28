package org.lang;
	//child class
public class LanguageInfo extends StateDetails{
	public static void main(String[] args) {
		LanguageInfo Lang=new LanguageInfo();
		Lang.tamilLanguage();
		Lang.englishLanguage();
		Lang.southIndia();
		Lang.northIndia();
		
	}
		
		private void tamilLanguage() {
			System.out.println("tamilLanguage is a easy language");
		}
		private void englishLanguage() {
			System.out.println("it is a common language");
		}
	}
	class StateDetails{
		//parent class
		public void southIndia() {
			System.out.println("chennai is in southindia");
		}
		public void northIndia() {
			System.out.println("bihar is in northindia");
		}
	}

