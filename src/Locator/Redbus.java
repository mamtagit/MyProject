package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.redbus.in/");
		WebElement txtUser=driver.findElement(By.xpath("//input[@id='src']"));
		txtUser.sendKeys("chennai");
		WebElement txtpass=driver.findElement(By.xpath("//input[@id='dest']"));
		txtpass.sendKeys("12345");
		
	}

}
