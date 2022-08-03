package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_class {
	public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			Actions a = new Actions(driver);
			Thread.sleep(2000);
			
			 WebElement dresses_button = driver.findElement
(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[.='Dresses']"));
			 a.moveToElement(dresses_button).build().perform();
			 Thread.sleep(2000);
			  WebElement evening_dress = driver.findElement
(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/child::li/a[.='Evening Dresses']"));
			  a.moveToElement(evening_dress).build().perform();
			  Thread.sleep(2000);
			  a.click(evening_dress).build().perform();
			  
			 WebElement t_shirt = driver.findElement
(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//child::li/ul//ul//li//following::li//a[.='T-shirts']"));
			 a.doubleClick(t_shirt).build().perform();
			  
			  
				
			 
			
		
		
	}

}
