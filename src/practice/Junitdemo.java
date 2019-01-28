package practice;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(" https://www.facebook.com/");
	}
	@AfterClass
	public static void afterclass() {
		driver.quit();
	}
	@Test
	public void test1(){
	WebElement txtUser=driver.findElement(By.id("email"));
	txtUser.sendKeys("Java");
	WebElement txtUser1=driver.findElement(By.id("pass"));
	txtUser1.sendKeys("Hello");
	WebElement txtUser2=driver.findElement(By.xpath("//input[@value='Log In']"));
	txtUser2.click();	
		}
	@Before
	public void beforemethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void aftermethod() {
		Date d=new Date();
		System.out.println(d);
	}
	}
	

