package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movera7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		Actions acc=new Actions(driver);
		WebElement txt=driver.findElement(By.xpath("//a[text()='All Departments']"));
		acc.moveToElement(txt).perform();
		WebElement txta=driver.findElement(By.xpath("//a[text()='Appliances']"));
		acc.moveToElement(txta).perform();
		WebElement txtb=driver.findElement(By.xpath("//a[text()='Washers & Dryers']"));
		acc.moveToElement(txtb).perform();
		//txtb.click();
	}
}
		