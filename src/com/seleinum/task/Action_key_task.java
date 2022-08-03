package com.seleinum.task;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_key_task {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement bestselling = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]"));
		//WebElement mobiles = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]"));
		//WebElement customer_service= driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]"));
		//WebElement today_deals = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]"));
		//WebElement fashion = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]"));
		
		Actions a = new Actions(driver);
	    a.contextClick(bestselling);
	    a.build().perform();
	    a.sendKeys(Keys.ARROW_DOWN);
	    a.keyDown(Keys.ENTER);
		a.build().perform();
		
		
		
		
		
		
	}

}
