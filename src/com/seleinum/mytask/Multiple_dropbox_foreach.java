package com.seleinum.mytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.seleinum.classs.my_Exception;

public class Multiple_dropbox_foreach {
	public static WebDriver driver;
	public static void main(String[] args) throws my_Exception, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
	
		 WebElement all_superheros = driver.findElement(By.id("superheros"));
		 Select s = new Select(all_superheros);
		//isMultiple
		  
		  if (s.isMultiple()) {
			  //getOptions
			  List<WebElement> all_options = s.getOptions();
			  System.out.println("count :"+ all_options.size());
			
			  for (WebElement superheros : all_options) {
				  if (superheros.getText().equals("Batman")
			      ||superheros.getText().equals("Batwoman")) {
					  String text = superheros.getText();
					  s.selectByVisibleText(text);
					  System.out.println(text);
					
				}
							
					  
					
				}
					
				}
				
		  }
	}

			  

		  
			
	
	