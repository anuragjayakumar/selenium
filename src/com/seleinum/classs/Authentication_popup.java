package com.seleinum.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//https:// the-internet.herokuapp.com/basic-auth
		//https://username:password@URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic-auth");
	}

}
