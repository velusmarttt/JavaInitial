package org.seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\work spaces\\SeleniumOpening\\org.driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement bank=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dropbox=driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(bank,dropbox).build().perform();
		WebElement text5000=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement accountdropboxleft=driver.findElement(By.xpath("//ol[@id='amt7']"));
		actions.dragAndDrop(text5000, accountdropboxleft).build().perform();
		WebElement sales=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement accountdropboxright=driver.findElement(By.xpath("//ol[@id='loan']"));
		actions.dragAndDrop(sales,accountdropboxright).build().perform();
		WebElement amount=driver.findElement(By.xpath("//ol[@id='amt8']"));
		actions.dragAndDrop(text5000, amount).build().perform();
		WebElement txtperfect=driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text=txtperfect.getText();
		System.out.println(text);
		
		
		
		
		
		
		

	}

}
