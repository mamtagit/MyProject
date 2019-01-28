package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement txtUser=driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
		txtUser.sendKeys("greenstechnology");
		WebElement txtpass=driver.findElement(By.xpath("//input[@id='f3e8ded7e7d2158']"));
		txtpass.sendKeys("1234698");
		
		}
}
