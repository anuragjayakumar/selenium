package com.seleinum.classs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_actions {
	public static WebDriver driver;

	public static void number_Of_Tables() {
		List<WebElement> table = driver.findElements(By.tagName("table"));
		System.out.println("size :" + table.size());
	}

	public static void particular_Data() {
		WebElement Tiger_Nixon_age = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr/td[4]"));
		System.out.println("age:" + Tiger_Nixon_age.getText());
	}

	public static void particular_Row_data() throws InterruptedException {
		List<WebElement> number_Of_rows = driver.findElements(By.xpath("//table[@id='table02']//tbody/tr[1]/td"));
		Thread.sleep(2000);
		System.out.println("no of rows:" + number_Of_rows.size());
		for (int i = 0; i <= number_Of_rows.size(); i++) {
			Thread.sleep(2000);
			System.out.println(number_Of_rows.get(i).getText());
		}
	
	}
	public static void particular_column() {
		List<WebElement> number_of_column = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[2]"));
		System.out.println("no of column:" + number_of_column.size());
		{
			for (int i = 0; i <= number_of_column.size(); i++) {
				//System.out.println("size:" + number_of_column.size());
				System.out.println("text:" + number_of_column.get(i).getText());
			}
		}
	}
		
	

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();// upcasting
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();// ----->method chaining
		// number_Of_Tables();
		// particular_Data();
		//particular_Row_data();
		particular_column();

	}

}
