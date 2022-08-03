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

public class Screenshot {
	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("anu*****gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("56757");
	   
		TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Snaps\\snap1.png");
        FileUtils.copyFile(source, destination);
        
        WebElement login_button = driver.findElement(By.name("login"));
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
        File source1 = ts.getScreenshotAs(OutputType.FILE);
        File destination1 = new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Snaps\\lastsnap2.png");
        FileUtils.copyFile(source1, destination1);
        
        driver.quit();
       
       

}
}
