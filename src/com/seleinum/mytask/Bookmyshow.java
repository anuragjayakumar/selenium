package com.seleinum.mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bookmyshow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		Thread.sleep(3000);
		WebElement skip = driver.findElement(By.xpath("//button[@class='No thanks']"));
		skip.click();
		Thread.sleep(3000);
		WebElement movies = driver.findElement(By.xpath("//a[text()='Movies']"));
		movies.click();
		Thread.sleep(3000);
		WebElement steam = driver.findElement(By.xpath("//a[text()='Stream']"));
		steam.click();
		Thread.sleep(3000);
		WebElement events = driver.findElement(By.xpath("//a[text()='Events']"));
		events.click();
		WebElement Plays = driver.findElement(By.xpath("//a[text()='Plays']"));
		Plays.click();
		WebElement Sports = driver.findElement(By.xpath("//a[text()='Sports']"));
		Sports.click();
		WebElement Activities = driver.findElement(By.xpath("//a[text()='Activities']"));
		Activities.click();
		WebElement Buzz = driver.findElement(By.xpath("//a[text()='Buzz']"));
		Buzz.click();
		Thread.sleep(2000);
		driver.get("https://www.ticketnew.com/Movie-Ticket-Online-booking/C/Chennai");
		Thread.sleep(2000);
		WebElement home = driver.findElement(By.xpath("//a[contains(@id,'aHome')]"));
		home.click();
		Thread.sleep(2000);
		WebElement now_showing = driver.findElement(By.xpath("//a[@href='#now_showing']"));
		now_showing.click();
		WebElement commingsoon = driver.findElement(By.xpath("//a[@href='#coming_soon']"));
		commingsoon.click();
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("anuarafhfj");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
		email.sendKeys("1234566");
		Thread.sleep(2000);		
		WebElement forgot_pass = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		forgot_pass.click();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}	

}
