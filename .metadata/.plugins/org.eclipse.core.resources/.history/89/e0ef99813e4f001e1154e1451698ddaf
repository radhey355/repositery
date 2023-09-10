package com.copy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDown {
	
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.findElement(By.xpath("//div[@class='create-new-account']")).getText());
		driver.findElement(By.xpath("//u[normalize-space()='Create a new account']")).click();
		
		//copy x path of where u click to dropdown
		WebElement element= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		 Select dropdown = new Select(element);
		 dropdown.selectByValue("28+25");
		 
		 WebElement element1 =	 driver .findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		 Select dropdown1 = new Select(element1);
		 dropdown1.selectByIndex(4 );
		 System.out.println("add");
// add branc in this code

}
