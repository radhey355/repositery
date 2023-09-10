package com.kiran.academy;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMultiTabe_andClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa3700.42965/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 	
		  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		 	
		 
		 	
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
		 	
			ArrayList<String> list_tabs=new ArrayList<String>(driver.getWindowHandles());
			System.out.println("=> "+list_tabs.size());
			
			for(int i=0;i<list_tabs.size();i++) {
				
				if(i!=0) {
					driver.switchTo().window(list_tabs.get(i));
					driver.close();
				}
				
			}
			
			driver.switchTo().window(list_tabs.get(0));
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
			
	}

}
