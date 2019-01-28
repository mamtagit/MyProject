package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyupndown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.facebook.com/");
	WebElement txtUser=driver.findElement(By.id("email"));
	Actions acc=new Actions(driver);
	acc.keyDown(txtUser,Keys.SHIFT).sendKeys(txtUser,"hello").keyUp(txtUser,Keys.SHIFT).perform();
	//driver.quit();
	}
}

