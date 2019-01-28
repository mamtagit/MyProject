package org.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamta\\workspace\\MyProject\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
       List<WebElement> tRows=driver.findElements(By.tagName("tr"));
        for(int i=0;i<tRows.size();i++){
        WebElement w=tRows.get(i);
        List<WebElement> tData=w.findElements(By.tagName("td"));
        for(int j=0;j<tData.size();j++){
        WebElement x=tData.get(j);
        if(x.getText().equals("Taiwan")){
         
       System.out.println(tData.get(i).getText());}
		//List<WebElement> tRows=driver.findElements(By.tagName("tr"));
		//WebElement w=tRows.get(3);
		//List<WebElement> tData=w.findElements(By.tagName("td"));
		//for(int i=0;i<tData.size();i++){
		//for(int i=0;i<tData.size();i++){
		//if(w1.getText().equals("Dubai")){
			//WebElement x=tData.get(i)	;
	    //System.out.println(x.getText());
		
        }
        }
	
	}
}

