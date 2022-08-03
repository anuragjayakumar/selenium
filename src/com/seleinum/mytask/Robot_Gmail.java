package com.seleinum.mytask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Gmail {
	public static WebDriver driver;
	public static void right_Click(WebDriver d , WebElement e ) {
		Actions a = new Actions(d);
		a.contextClick(e).build().perform();
	}		
		private static void down_And_Enter() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}
		
		

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement bestselling = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]"));
		WebElement mobiles = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]"));
		WebElement customer_service= driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]"));
	    WebElement today_deals = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]"));
		WebElement fashion = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]"));
		WebElement electronics = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]"));
		WebElement book = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]"));
		WebElement prime = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]"));
		
		right_Click(driver, bestselling);
		down_And_Enter();
		right_Click(driver, mobiles);
		down_And_Enter();
		right_Click(driver, customer_service);
		down_And_Enter();
		right_Click(driver,today_deals);
		down_And_Enter();
		right_Click(driver, fashion);
		down_And_Enter();
		right_Click(driver, electronics);
		down_And_Enter();
		right_Click(driver,book);
		down_And_Enter();
		right_Click(driver, prime);
		down_And_Enter();
		
		
		
		
		
		
		
		
		
		
	
	}

}
