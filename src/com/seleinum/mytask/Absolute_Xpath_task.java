package com.seleinum.mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_task {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().window().maximize();
		
		 WebElement iphone_ = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div/div/div/div/img"));
		 iphone_.click();
		
		 
		
		
		
	}

}
