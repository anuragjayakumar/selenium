package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_past_action_key {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement fb = driver.findElement(By.id("email"));
		 fb.sendKeys("abtrb");
		 Actions a = new Actions(driver);
		 //ctrl+a
		 a.keyDown(Keys.CONTROL);
		 a.sendKeys("a");
		 a.sendKeys("c");
		 a.keyUp(Keys.CONTROL);
		 a.sendKeys(Keys.TAB);
		 a.keyDown(Keys.CONTROL);
		 a.sendKeys("v");
		 a.keyUp(Keys.CONTROL);
		 a.build().perform();
	
		 
		 
	}

}
