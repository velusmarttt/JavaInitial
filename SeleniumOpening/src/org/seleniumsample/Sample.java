package org.seleniumsample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\work spaces\\SeleniumOpening\\org.driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://adactinhotelapp.com/");
		//to get the current url
		String currenturl=Driver.getCurrentUrl();
		System.out.println(currenturl);
		//to get the title
		String title=Driver.getTitle();
		System.out.println(title);
		WebElement txtadactin=Driver.findElement(By.xpath("//p[contains (text(),'Adactin')]"));
		String text=txtadactin.getText();
		System.out.println(text);
	}	
		
		

}