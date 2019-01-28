package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		WebElement txtUser=driver.findElement(By.xpath("(//input[@class='inputtext'])[1]"));
		txtUser.sendKeys("mamta");
		WebElement txtpass=driver.findElement(By.xpath("(//input[@class='inputtext'])[2]"));
		txtpass.sendKeys("1234567");
		WebElement btnlog=driver.findElement(By.xpath("//input[@value='Log In']"));
		//btnlog.click();
	}


}
