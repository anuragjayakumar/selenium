package com.seleinum.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_task {
	public static WebDriver driver;
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
		Actions a = new Actions(driver);
		Robot r = new Robot();
		a.contextClick(bestselling).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		a.contextClick(mobiles).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		a.contextClick(customer_service).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		a.contextClick(today_deals).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		a.contextClick(fashion).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		a.contextClick(electronics).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		a.contextClick(book).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		a.contextClick(prime).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}