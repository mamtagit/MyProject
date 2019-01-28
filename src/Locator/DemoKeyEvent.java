package Locator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoKeyEvent {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(6000);
		WebElement btnlog=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions acc=new Actions(driver);
		acc.contextClick(btnlog).perform();
		Robot r=new Robot();
		for(int i=1;i<=2;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}

}
}
