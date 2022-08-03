package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_xpath {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//following sibiling
		//best_seller targeted fashion
		
		  WebElement fashion = driver.findElement(By.xpath("//a[@class='nav-a  ']/following-sibling::a[4]"));
		  fashion.click();
	      //preceding-sibling
	     //fashion targeted bestseller
		  WebElement bestseller = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_fashion']/preceding-sibling::a"));
		bestseller.click();
		

		
		
		
		
		
	}
	
}
