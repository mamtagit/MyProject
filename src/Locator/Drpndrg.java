package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drpndrg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement srcweb=driver.findElement(By.id("credit2"));
		WebElement desweb=driver.findElement(By.id("bank"));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(srcweb,desweb).perform();
		WebElement srcweba=driver.findElement(By.id("fourth"));
		WebElement desweba=driver.findElement(By.id("amt7"));
		acc.dragAndDrop(srcweba,desweba).perform();
		
		

}
}
