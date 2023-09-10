package com.kiran.academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

                              // print the full data table

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa3700.42965/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 	
		  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		  
		  driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		  
		List<WebElement> texts =  driver.findElements(By.tagName("tr"));
		for (WebElement el : texts) {
			System.out.println(el.getText());
			
		}
		 	

	}

}
