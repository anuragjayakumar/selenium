package com.seleinum.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
	WebDriver driver = new  ChromeDriver();
	driver.get("http://practice.automationtesting.in/");
	driver.manage().window().maximize();
	WebElement my_account = driver.findElement(By.xpath("//a[text()='My Account']"));
	my_account.click();
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	username.sendKeys("anaurag@12342");
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	password.sendKeys("rag2435");
	Thread.sleep(2000);
	
	WebElement login_button = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	login_button.click();
	
	
	

	
}
}
