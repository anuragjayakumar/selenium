package com.seleinum.classs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_table_data {
	public static WebDriver driver;
	public static void all_data() {
		 List<WebElement> all_Table_Data = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
		 
		 System.out.println("size :"+all_Table_Data.size());
		 
		 for (int i = 0; i <= all_Table_Data.size(); i++) {
			 System.out.println("all_data:"+all_Table_Data.get(i).getText());
			
		}
		 
		 

	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		all_data();
		
		
	}

}
