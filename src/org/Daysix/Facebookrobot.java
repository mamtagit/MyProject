package org.Daysix;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebookrobot {
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		Actions acc=new Actions(driver);
		WebElement txtUser=driver.findElement(By.id("email"));
		txtUser.sendKeys("email");
		acc.doubleClick(txtUser).perform();
		//WebElement txtUsert=driver.findElement(By.id("pass"));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		WebElement txtUsert=driver.findElement(By.id("pass"));
		txtUsert.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
}
		
		 
	   
		

		
		

