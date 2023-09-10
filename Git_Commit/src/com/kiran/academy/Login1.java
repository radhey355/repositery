package com.kiran.academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	System.out.println(driver.findElement(By.xpath("//div[@class='create-new-account']")).getText());
	driver.findElement(By.xpath("//u[normalize-space()='Create a new account']")).click();
	}

}
