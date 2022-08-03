package com.seleinum.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomoto {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		WebElement location_detector = driver.findElement(By.xpath("//input[@placeholder='Chennai']"));
		location_detector.sendKeys("mumbai");
		// attributeName
		String attri_Name = location_detector.getAttribute("Chennai");
		System.out.println("AttributeName:" + attri_Name);
		// attributeValue
		String attri_value = location_detector.getAttribute("placeholder");
		System.out.println("Attributevalue:" + attri_value);
		// tagName
		System.out.println("tagname:" + location_detector.getTagName());
		// location
		System.out.println("location:" + location_detector.getLocation());
		// getSize
		System.out.println("width and length:" + location_detector.getSize());
		// CSS
		WebElement Zomoto_Heading = driver.findElement(By.xpath("//h1"));
		String colour = Zomoto_Heading.getCssValue("background-colour");
		System.out.println("colour:" + colour);
	
		WebElement login = driver.findElement(By.xpath("(//a[@tabindex ='-1'])[3]"));
		login.click();
		WebElement phonenumber = driver.findElement(By.xpath("//input[@type ='number']"));
		phonenumber.sendKeys("8678686797");
		
	
		
		
		
		
		

	}

}
