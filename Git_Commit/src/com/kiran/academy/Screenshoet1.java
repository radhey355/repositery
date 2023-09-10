package com.kiran.academy;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshoet1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	System.out.println(driver.findElement(By.xpath("//div[@class='create-new-account']")).getText());
	driver.findElement(By.xpath("//u[normalize-space()='Create a new account']")).click();
	
	//Screen Short
	  TakesScreenshot screen = ((TakesScreenshot)driver);
	   File file = screen.getScreenshotAs(OutputType.FILE);
	  
    //copy apachi(Apache Commons IO » 2.11.0)  maven repositery for copy file
	   
	   String path ="C:\\Users\\HP\\eclipse-workspace\\Revise\\screenshot\\img3.png";
	  try {
		FileUtils.copyFile(file , new File(path));
	} catch (IOException e) {
		
		e.printStackTrace();
		
	}
	  driver.quit();
	}
	

}
