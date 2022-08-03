package com.seleinum.classs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Alert_javaScript {
	public static WebDriver driver;
	public static void confirm_Alert() {
		 WebElement confirm_Alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		 confirm_Alert.click();
		 
		 WebElement confirm_button = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		 confirm_button.click();
		  Alert confirm_alt = driver.switchTo().alert();
		  System.out.println("text:"+confirm_alt.getText());
		  confirm_alt.accept();
		  
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		confirm_Alert();

		
		
		
		
		
	}

}
