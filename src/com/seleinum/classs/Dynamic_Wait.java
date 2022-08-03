package com.seleinum.classs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Wait {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement fb = driver.findElement(By.id("email"));
		 fb.sendKeys("abtrb");
		  WebElement password = driver.findElement(By.id("pass"));
		  password.sendKeys("t4ryrfy");
		  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		  driver.get("https://www.amazon.in/");
		 
	}

}
