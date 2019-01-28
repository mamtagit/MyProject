package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/careers.html");
		WebElement moucourse=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(moucourse).perform();
		WebElement moucourseot=driver.findElement(By.xpath("//a[text()='Java Training']"));
		acc.moveToElement(moucourseot).perform();
		moucourseot.click();
		
		 
		
}
}