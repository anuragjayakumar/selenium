package com.seleinum.classs;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Comment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("size:"+size);
		 Dimension d = new Dimension(104,239);
		 driver.manage().window().setSize(d);
		
		
	}

}
