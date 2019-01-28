package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/");
			String url=driver.getCurrentUrl();
			System.out.println(url);
			driver.quit();
		}
		}
	
	


