package com.seleinum.classs;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {
	public static WebDriver driver;
	
	public static  void count_Of_Frames() {
		  List<WebElement> all_Frames = driver.findElements(By.tagName("iframe"));
		  System.out.println("count :"+ all_Frames.size());
			  
		  }
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		driver.switchTo().frame("singleframe");
		WebElement enter_text = driver.findElement(By.xpath("//input[@type='text']"));
		enter_text.sendKeys("data");

		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		WebElement multiple_btn = driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
		multiple_btn.click();

		WebElement outer_frame = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(outer_frame);

		WebElement inner_frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner_frame);

		WebElement inside_txtbox = driver.findElement(By.xpath("//input[@type='text']"));
		inside_txtbox.sendKeys("data2");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement video_btn = driver.findElement(By.xpath("//a[text()='Video']"));
		video_btn.click();
		
		WebElement youtube = driver.findElement(By.xpath("//a[text()='Youtube']"));
		youtube.click();
		Thread.sleep(2000);
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notifications");
		 count_Of_Frames();

		
		
	
		
		

		
	}

}
