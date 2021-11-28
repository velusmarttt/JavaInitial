package org.sample.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// set the property of browser
	System.setProperty("webdiver.chrome.driver","F:\\softwares\\work spaces\\SampleProject\\src\\org\\sample\\Driver\\chromedriver.exe");
	//initialize webdriver
	WebDriver Drive=new ChromeDriver();
	//to launch url
	Drive.get("https://www.facebook.com");
	}

}
