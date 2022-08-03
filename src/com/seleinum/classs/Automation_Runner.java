package com.seleinum.classs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_Runner {
	public static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		 WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		 signin.click();
		 
		 WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		 email.sendKeys("anurag@6875.com");
		 
		 WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		 password.sendKeys("Anurag@12457");
		 
		 WebElement submit_btn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		 submit_btn.click();
		 
		 Actions a = new Actions(driver);
		  WebElement dresses = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[.='Dresses']"));
		  a.moveToElement(dresses).build().perform();
		 WebElement evening_dress = driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/li/a[.='Evening Dresses']"));
		 a.click(evening_dress).build().perform();
		 
		 WebElement img_view = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		 img_view.click();
		 
		 WebElement qty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']/span/i"));
		 
		 
		 
		 
			
		 
		 
		
	}

}
