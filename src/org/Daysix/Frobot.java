package org.Daysix;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frobot {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		Actions acc=new Actions(driver);
		WebElement txtUser=driver.findElement(By.id("lga"));
		txtUser.click();
		WebElement txtUserOT=driver.findElement(By.xpath("//a[text()='Gmail']"));
		txtUserOT.click();

}
}