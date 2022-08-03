package com.seleinum.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Open {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println(driver);
	
		
		
		
	}

}
