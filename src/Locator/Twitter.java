package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
		WebElement txtUser=driver.findElement(By.xpath("//input[@id='doc']"));
		txtUser.sendKeys("chennai");
		WebElement txtpass=driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("123456");
		
	}

}