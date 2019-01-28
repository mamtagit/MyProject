package org.Daysix;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmail2 {
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement txtUser=driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		txtUser.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		WebElement txtUsera=driver.findElement(By.xpath("//button[text()='Confirm Pop up']"));
		txtUsera.click();
		al.dismiss();
		WebElement txtUserb=driver.findElement(By.xpath("//button[text()='Prompt Pop up']"));
		txtUserb.sendKeys("yes");
		txtUserb.click();
		al.accept();
		al.dismiss();
	}
}
