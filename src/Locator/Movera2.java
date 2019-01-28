package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movera2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		WebElement txt=driver.findElement(By.xpath("//input[@class='_1QZ6fC _3Lgyp8']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(txt).perform();
}
}
