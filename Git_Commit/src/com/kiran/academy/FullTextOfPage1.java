package com.kiran.academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullTextOfPage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
	
		//	print the full table-data
		
		
      List<WebElement> texts =	 driver.findElements(By.tagName("td"));
     
      for(WebElement el:texts) {
    	 System.out.println(el.getText());
     }
		
	}

}
