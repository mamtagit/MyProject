package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptdemo {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		WebElement txtusername = driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','greens')", txtusername);
		WebElement txtuserpass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','Hello')", txtuserpass);
		String name=(String) js.executeScript("retuen arguments[0].getAttribute('value')", txtusername);
		String pass=(String)js.executeScript("retuen arguments[0].getAttribute('value')", txtuserpass);
		System.out.println(name);
		System.out.println(pass);
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		js.executeScript("arguments[0].click()",btn);
        driver.quit();		
		
		

}
}
 