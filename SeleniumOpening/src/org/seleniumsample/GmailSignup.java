package org.seleniumsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSignup {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\work spaces\\SeleniumOpening\\org.driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtfrstname=driver.findElement(By.id("firstName"));
		txtfrstname.sendKeys("velu");
		WebElement txtlastname=driver.findElement(By.id("lastName"));
		txtlastname.sendKeys("smarttt");
		WebElement txtusername=driver.findElement(By.id("username"));
		txtusername.sendKeys("velusmiles33");
		WebElement txtpass=driver.findElement(By.name("Passwd"));
		txtpass.sendKeys("Monsterboy.3@");
		WebElement txtconfirm=driver.findElement(By.name("ConfirmPasswd"));
		txtconfirm.sendKeys("Monsterboy.3@");
		WebElement nextbutton=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		nextbutton.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement txtphonenumber=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tel']")));
		txtphonenumber.sendKeys("8668146532");
		//WebElement nextbutton2=driver.findElement(By.)
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[1]"))).click();
		
	
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
																																																										
													
