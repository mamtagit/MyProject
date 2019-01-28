package Locator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/careers.html");
	//Thread.sleep(3000);
	WebElement btnclos = driver.findElement(By.xpath("(//button[text()='×'])[1]"));
	btnclos.click();
	Actions acc= new Actions(driver);
	WebElement moucourse=driver.findElement(By.xpath("//a[text()='COURSES']"));
	acc.moveToElement(moucourse).perform();
	WebElement mouc=driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
	acc.moveToElement(mouc).perform();
	WebElement btnlog=driver.findElement(By.xpath("//span[text()='Selenium Training']"));
    btnlog.click();
	
}
}