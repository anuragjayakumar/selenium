package com.seleinum.classs;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("anu*****gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("56757");
		WebElement login_button = driver.findElement(By.name("login"));
		WebElement forgot_password = driver.findElement(By.linkText("Forgotten password?"));
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Snaps\\snap2.png");
        FileUtils.copyFile(source, destination);
		forgot_password.click();
		driver.navigate().back();
		driver.quit();
	
		
		
		
		
		
		
		
	}

}
