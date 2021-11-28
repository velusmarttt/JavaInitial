package org.seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("web driver.chrome.driver","F:\\softwares\\work spaces\\SeleniumOpening\\src\\org\\seleniumsample\\Amazon.java" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
		WebElement txtamazon=driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
		String text=txtamazon.getText();
		System.out.println(text);

	}

}
