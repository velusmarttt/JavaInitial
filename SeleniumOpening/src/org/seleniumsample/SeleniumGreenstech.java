package org.seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGreenstech {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("web driver.chrome.driver","F:\\softwares\\work spaces\\SeleniumOpening\\src\\org\\seleniumsample\\Amazon.java" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
		WebElement overview=driver.findElement(By.xpath("//a[@id='overview-tab']"));
		overview.click();
		Thread.sleep(5000);
		WebElement txtgreens=driver.findElement(By.xpath("//h3[@id='heading661']"));
		String text=txtgreens.getText();
		System.out.println(text);
		
		
		
		

}
}
