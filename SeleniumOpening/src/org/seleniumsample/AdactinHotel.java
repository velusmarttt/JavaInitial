package org.seleniumsample;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdactinHotel {

	private static final keyEvent v = null;

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("web driver.chrome.driver","F:\\softwares\\work spaces\\SeleniumOpening\\src\\org\\seleniumsample\\DemoTesting.java");
		driver.get("https://adactinhotelapp.com/");
		Actions actions=new Actions(driver);
		//keyboard actions
		Robot robot=new Robot();
		int i;
		for(int inti=1;i<=4;i++) {
		//down
		robot.keyPress(keyEvent.vk-v);
		robot.keyRelease(keyEvent.vk-v);
		

	}

}
