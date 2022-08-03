package com.seleinum.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("vivo phones");
		WebElement searchbutton = driver.findElement(By.xpath("//div[@class='nav-right']/div/span//input[@value='Go']"));
		searchbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement vivo_v23_ = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//child::span[.='Vivo V23 5G (Sunshine Gold, 8GB RAM 128GB Storage)']"));
		vivo_v23_.click();
		
		
		
		
		
		
		
		
		
	}

}
