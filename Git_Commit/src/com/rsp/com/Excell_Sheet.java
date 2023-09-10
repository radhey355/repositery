package com.rsp.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excell_Sheet {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\TestCase\\READ.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int row= sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < column; j++) {
				
				DataFormatter dft = new DataFormatter();
		System.out.println(dft.formatCellValue(sheet.getRow(i).getCell(j)));
				}
			System.out.println();
			
		}
		workbook.close();
		fis.close();
	}

}
