package Locator;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoEnum {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement web=driver.findElement(By.id("email"));
		Actions acc=new Actions(driver);
		acc.keyDown(web,Keys.SHIFT).sendKeys(web,"hello").perform();
}
}
