package org.seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\work spaces\\SeleniumOpening\\org.driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sprint.com/");
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		}
		catch(Exception e){
			System.out.println("No Modal Window");
		}
		WebElement clickphonesanddevices=driver.findElement(By.xpath("//a[text()=' Phones & devices ']"));	
		Actions actions=new Actions(driver);
		actions.moveToElement(clickphonesanddevices).build().perform();
		WebElement click5gmobiles=driver.findElement(By.xpath("//*[@id=\"nav-link-contaniner-1\"]/div/div/div/a[2]"));
		click5gmobiles.click();
		Thread.sleep(2000);
		WebElement txtpara=driver.findElement(By.xpath("//a[@id='digital-footer-bottom-link-bottom-9']"));
		String text=txtpara.getText();
		System.out.println(text);
		
	}

}
