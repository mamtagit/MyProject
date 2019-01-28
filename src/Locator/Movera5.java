package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movera5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		//driver.get("https://www.w3schools.com/");
		WebElement moucourse=driver.findElement(By.id("nav_44"));
		Actions acc=new Actions(driver);
		acc.moveToElement(moucourse).perform();

}
}