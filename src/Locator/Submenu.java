package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Submenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		//driver.get("https://www.w3schools.com/");
		Actions acc=new Actions(driver);
		WebElement moucourse=driver.findElement(By.id("nav_45"));
		acc.moveToElement(moucourse).perform();
		 //Thread.sleep(500);
		WebElement moucourse1=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		//Actions acc1=new Actions(driver);
		acc.moveToElement(moucourse1).perform();
		moucourse1.click();

	}

}
