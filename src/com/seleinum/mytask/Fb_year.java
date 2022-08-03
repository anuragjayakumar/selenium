package com.seleinum.mytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.seleinum.classs.my_Exception;

public class Fb_year {
public static WebDriver driver;
	
	
	public static void main(String[] args) throws my_Exception, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Create_Account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Create_Account.click();
		Thread.sleep(2000);
		
		WebElement all_year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s_year = new Select(all_year); 
		if (s_year.isMultiple()) {
			 List<WebElement> get_Option = s_year.getOptions();
			 System.out.println("day_options:"+ get_Option.size());
			
		} else {
			throw new my_Exception("it is a single");

		}

}
}




