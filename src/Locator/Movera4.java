package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movera4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		WebElement txt=driver.findElement(By.xpath("//a[text()='Entertainment']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(txt).perform();
	
	}
}
