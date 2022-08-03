package com.seleinum.classs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt_Alertt {
	public static WebDriver driver;
	
	public static void promt_alert() {
		WebElement alert_with_txt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alert_with_txt.click();
		WebElement button_enter = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		button_enter.click();
		  Alert promt_Alert = driver.switchTo().alert();
		  promt_Alert.accept();
		
	
		
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		promt_alert();
		
		
		
	}

}
