package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement txtUser=driver.findElement(By.xpath("//input[@class='inputtext'][1]"));	
	txtUser.sendKeys("mamta");
	System.out.println("attribute");
	WebElement txtclear=driver.findElement(By.xpath("//span[text()='create an account']"));
	
}
}
