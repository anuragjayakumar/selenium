package com.seleinum.mytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.seleinum.classs.my_Exception;

public class Fb_day {
public static WebDriver driver;
	
	
	public static void main(String[] args) throws my_Exception, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Create_Account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Create_Account.click();
		Thread.sleep(2000);
		
		WebElement all_day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s_day = new Select(all_day); 
		if (s_day.isMultiple()) {
			 List<WebElement> get_Option = s_day.getOptions();
			 System.out.println("day_options:"+ get_Option.size());
			
		} else {
			throw new my_Exception("it is a single");

		}

}
}
