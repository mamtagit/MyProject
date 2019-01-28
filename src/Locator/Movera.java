package Locator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movera {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		//driver.get("https://www.w3schools.com/");
		WebElement moucourse=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(moucourse).perform();
		//moucourse.clear();
		WebElement moucourseOT=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		acc.moveToElement(moucourseOT).perform();
		//moucourseOT.click();
		WebElement moucourseOT1=driver.findElement(By.xpath("//span[text()='Oracle PlSQL Training']"));
		acc.moveToElement(moucourseOT1).perform();
	moucourseOT1.click();

	}
}
