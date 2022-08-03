package com.seleinum.mytask;

import java.util.NavigableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web_element {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	WebElement email_text = driver.findElement(By.id("email"));
	email_text.sendKeys("anuarag*****@gmail.com");
	
	WebElement password_Text = driver.findElement(By.id("pass"));
	password_Text.sendKeys("234");
	 
	WebElement forgot_Link = driver.findElement(By.linkText("Forgotten password?"));
	forgot_Link.click();
	driver.navigate().back();
	
	WebElement create_Page_link = driver.findElement(By.linkText("Create a Page"));
    create_Page_link.click();
    Thread.sleep(2000);
   driver.quit();
    
	
	
	
	
	
	
		
	}

}

