package com.seleinum.mytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_salary {
	public static WebDriver driver;
	// salary

	public static void _Salary_position() {
	List<WebElement> all_salary_names = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[1]"));
	List<WebElement> all_salary_list = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));
	int salaries = 0;
	for (int i = 0; i <=all_salary_list.size(); i++) {
		if (all_salary_list.get(i).getText().equals("salary")) {
			salaries= i+1;
			
		}
		
		
	}
	System.out.println("salary position :"+salaries);
	
	
			}
			
			
			

	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");
		_Salary_position();

	}
}
