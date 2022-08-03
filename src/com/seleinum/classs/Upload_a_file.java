package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_a_file {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		 WebElement resume = driver.findElement(By.xpath("//span[.='Upload Resume']"));
		 resume.click();
		  WebElement upload = driver.findElement(By.id("file-upload"));
		  upload.sendKeys("C:\\Users\\Manojkrishnan\\Downloads");
		  
		
		
		
	}

}
