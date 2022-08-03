package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		WebElement signup_btn = driver.findElement(By.xpath("//a[.='Sign Up']"));
		//narrowing type casting or downcasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//sentkeys
		js.executeScript("arguments[0].value= 'anaurag'",email);
		//highlight
		js.executeScript("arguments[0].setAttribute('style','color:green')", email);
		//scroll down
		js.executeScript("arguments[0].scrollIntoView()", signup_btn);
		//click
		js.executeAsyncScript("arguments[0].click()", signup_btn);
		
		
		
		
		
	}

}
