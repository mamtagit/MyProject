package org.Daysix;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmail6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.sprint.com/");
		WebElement txtUser=driver.findElement(By.xpath("//button[text()='Submit']"));
		txtUser.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
}
