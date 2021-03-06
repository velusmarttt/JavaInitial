package org.seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("web driver.chrome.driver","F:\\softwares\\work spaces\\SeleniumOpening\\src\\org\\seleniumsample\\DemoTesting.java");
		driver.get("http://demo.automationtesting.in/Register.html");
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
		WebElement txtfirstname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtfirstname.sendKeys("venkat");
		WebElement txtlastname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtlastname.sendKeys("vel");
		WebElement txtaddress=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtaddress.sendKeys("no.78 thoraipakkam omr");
		WebElement txtemailaddress=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		txtemailaddress.sendKeys("velusmiles3@gmail.com");
		WebElement typephonenumber=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		typephonenumber.sendKeys("8680057367");
		WebElement radiomale=driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
		radiomale.click();
		WebElement hobbiescricket=driver.findElement(By.xpath("(//input[@type='checkbox' and @value='Cricket'])"));
		hobbiescricket.click();
		WebElement lnklanguage=driver.findElement(By.xpath("//div[@id='msdd']"));
		lnklanguage.click();
		Thread.sleep(2000);
		WebElement lnkEnglish=driver.findElement(By.xpath("//a[text()='English']"));
		lnkEnglish.click();
		//Actions actions=new Actions(driver);
		//actions.moveToElement(lnklanguage).perform();
		WebElement txtskills=driver.findElement(By.xpath("//select[@id='Skills'])"));
		txtskills.sendKeys("quick learner");
		WebElement txtcountries=driver.findElement(By.xpath("//select[@id='countries'])"));
		txtcountries.sendKeys("india");
		WebElement txtselectcountry=driver.findElement(By.xpath("//span[@role='combobox'])"));
		txtselectcountry.sendKeys("canada");
		
		
	}

}
