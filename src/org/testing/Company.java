package org.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement>cols=driver.findElements(By.xpath("//input[@id='content']/table/thread/tr/th"));
		System.out.println("no of cols are:" +cols.size());
		List<WebElement> Rows=driver.findElements(By.xpath("//input[@id='content']/table/tbody/thread/tr/th"));
        System.out.println("no of rows are:"+Rows.size());
        //List<WebElement> rank=driver.findElements(By.xpath("//input[@class='odd']/table/tbody/tr/td/"));
        //System.out.println("rank of china is:");
        driver.close();
}
}
