package org.Daysix;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertmail {
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.mail.rediff.com/cgi_bin/login.cgi");
		WebElement txtUser=driver.findElement(By.id("proceed"));
		txtUser.click();
		Alert al=driver.switchTo().alert();
        al.accept();
        driver.quit();
}
}
