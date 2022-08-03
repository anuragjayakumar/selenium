package com.seleinum.mytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table_task {
	public static WebDriver driver;

	public static void print_Age() throws InterruptedException {
		List<WebElement> age = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[4]"));
		List<WebElement> name = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[1]"));
		for (int i = 0; i <= age.size(); i++) {
			if (Integer.parseInt(age.get(i).getText()) >= 61) {
				System.out.println("print_60S age:" + age.get(i).getText());
				System.out.println("print_name:" + name.get(i).getText());
			}
		}
	}
	public static void salaries() {
		List<WebElement> salaries = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[6]"));
		List<WebElement> salary_position = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[2]"));
		for (int i = 0; i <= salaries.size(); i++) {
			System.out.println("salary:"+salaries.get(i).getText());
			System.out.println("position:"+salary_position.get(i).getText());
			//salary greater than 1 lakhs
		List<WebElement> salary = salaries;
		for (int j = 0; j <= salary.size(); j++) {
			if(Integer.parseInt (salary.get(j).getText())>= 1000000){
				System.out.println("salary above 1lks:"+salary.get(j).getText());
				
			}
		}
		}
	}	
		
		     
		

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		salaries();

	

	}
}