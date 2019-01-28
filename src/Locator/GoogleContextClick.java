package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleContextClick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement btnlog=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions acc=new Actions(driver);
		acc.contextClick(btnlog).perform();
		//driver.quit();
		
		
	}
}
