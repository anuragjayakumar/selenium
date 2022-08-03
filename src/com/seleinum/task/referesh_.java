package com.seleinum.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class referesh_ {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to(driver.getCurrentUrl());
		
		
		
		
	}

}
