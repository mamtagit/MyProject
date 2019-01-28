package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movera6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		//driver.get("https://www.w3schools.com/");
		Actions acc=new Actions(driver);
		WebElement moucourse=driver.findElement(By.id("nav_45"));
		//WebElement btnlog=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		//Actions acc=new Actions(driver);
		acc.moveToElement(moucourse).perform();
		//acc.moveToElement(btnlog).perform();
		//btnlog.click();

}
}
