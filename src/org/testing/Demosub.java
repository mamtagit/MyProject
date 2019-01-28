package org.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demosub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
       List<WebElement> tRows=driver.findElements(By.tagName("tr"));
        //for(int i=0;i<tRows.size();i++){
        WebElement w=tRows.get(0);
        List<WebElement> tdata=driver.findElements(By.tagName("td"));
        for(WebElement x:tdata)
        System.out.println(x.getText());
        driver.quit();

	}

}
