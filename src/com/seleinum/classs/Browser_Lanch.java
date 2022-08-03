package com.seleinum.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Lanch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		//getTitle (return the current webpage title)
		
		String title = driver.getTitle();
		System.out.println("get title:"+ title);
		
		String url = driver.getCurrentUrl();
		System.out.println("current url"+url);
	}

}
