package com.seleinum.classs;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	public static WebDriver driver;
	public static void main(String[] args) throws my_Exception, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
	
		 WebElement all_superheo = driver.findElement(By.id("superheros"));
		 Select s = new Select(all_superheo);
		//isMultiple
		  
		  if (s.isMultiple()) {
			  //getOptions
			  List<WebElement> all_options = s.getOptions();
			  System.out.println("count :"+ all_options.size());
			
			  for (int i = 0; i <= all_options.size(); i++) {
				  if (all_options.get(i).getText().equals("Batman")
						  ||all_options.get(i).getText().equals("Batwoman") )
				  {
					  String text = all_options.get(i).getText();
					  s.selectByVisibleText(text);
					  System.out.println(text);
					
				}
				
			}
		} else {
			throw new my_Exception("its single dropdown");

		}
	
	}
	

}
