package com.seleinum.mytask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_window_handling {
	public static WebDriver driver;
		public static void down_And_Enter() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}
		
		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			 WebElement gmail = driver.findElement(By.xpath("//div[@class='LX3sZb']//child::a[.='Gmail']"));
			 Actions a = new Actions(driver);
			 a.contextClick(gmail).build().perform();
			 down_And_Enter();
			 String google_id = driver.getWindowHandle();
			 Set<String>all_id = driver.getWindowHandles();
			 for (String id : all_id) {
				 if (id!=google_id) {
					 
					   String title = driver.switchTo().window(id).getTitle();
					   System.out.println("current page title:"+ title);
					
				}
				
			}
				
			}
			
			
		}


