package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Single_Dropdown_ {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 WebElement create_page = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create_page.click();
		Thread.sleep(2000);
		 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		
		 Select s = new Select(day);
		 boolean multiple = s.isMultiple();
		 System.out.println("multiple or not :"+multiple);
		 s.selectByIndex(1);
		 s.selectByIndex(2);
		 // getFirstSelectedOption
		 
		 WebElement first_select = s.getFirstSelectedOption();
		 System.out.println("first option :"+ first_select.getText());
		 
		Select s_mon = new Select(month);
		//selectbyvalue 
		s_mon.selectByValue("4");
		
		Select s_year = new Select(year);
		s_year.selectByVisibleText("2018");
		
		Select s_3 = new Select(driver.findElement(By.id("year")));
		
	
		 
		 
		
		 
		 
		
		 
		
		
	}
	

}
