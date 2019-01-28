package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movera1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions acc=new Actions(driver);
		WebElement txt=driver.findElement(By.xpath("//span[text()='Shop by']"));
		acc.moveToElement(txt).perform();
		//WebElement submenu=driver.findElement(By.xpath("//span[text()='All Mobile Accessories']"));
		//acc.moveToElement(submenu).perform();
		WebElement txta=driver.findElement(By.xpath("//span[text()='Amazon Prime Music']"));
		acc.moveToElement(txta).perform();
		
		
	
		
	}

}
