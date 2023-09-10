package com.kiran.academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
 //     seach by <iframe in ctrl+f 
		
		driver.switchTo().frame("moneyiframe");
		
//        SEARCH THE COMPANY NAME
		
		driver.findElement(By.className("getquoteinput")).sendKeys("MRF");
		driver.findElement(By.className("getqbtn")).click();
		
    	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/a")).getText());
    	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/a")).getText());
		

	}

}
