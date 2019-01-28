package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(" https://www.snapdeal.com/login");
			WebElement txtUser=driver.findElement(By.xpath("//input[@class='col-xs-24']"));
			txtUser.sendKeys("chennai");
			

}
	}
