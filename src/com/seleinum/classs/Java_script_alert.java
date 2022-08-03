package com.seleinum.classs;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script_alert {
	public static WebDriver driver;
	public static  void Simple_Alert() throws InterruptedException {
		
		 WebElement  s_alert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		 s_alert.click();
		 Thread.sleep(2000);
		 
		  Alert simple_Alert = driver.switchTo().alert();
		//  simple_Alert.accept();
		  simple_Alert.dismiss();
		  Thread.sleep(2000);

	}	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Simple_Alert();
		
	}
	

}
