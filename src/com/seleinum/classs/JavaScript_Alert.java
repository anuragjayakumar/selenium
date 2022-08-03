package com.seleinum.classs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Alert {
	public static WebDriver driver;
	
	public  void simple_Alert() throws InterruptedException {
	 WebElement alert_btn = driver.findElement(By.xpath(""));
	Alert simple_Alert = driver.switchTo().alert();
	Thread.sleep(2000);
	
}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome,driver", "C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		
	}


}


