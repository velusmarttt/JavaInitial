package org.seleniumsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Greenstechnology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\softwares\\work spaces\\SeleniumOpening\\org.driver\\geckodriver.exe");
		WebDriver Drive=new FirefoxDriver();
		Drive.manage().window().maximize();
		Drive.get("https://www.facebook.com/");
	}

}
