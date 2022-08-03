package com.seleinum.mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xparth_task2 {
	public static WebDriver driver;
		
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		// WebElement cancel = driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
		 //cancel.click();
		 //Thread.sleep(2000);	 
	  WebElement search = driver.findElement(By.xpath("//div[@id='super-wrapper']/div/div[2]/header/div/div/div/div/div/div[2]/div/span[2]"));
	 search.click();
	  WebElement search_movie = driver.findElement(By.xpath("//div[@class='sc-ivVeuv GrqBD']/div[2]/div/div/div[2]/div/div/div/input"));
	 search_movie.sendKeys("vikram");
	 Thread.sleep(2000);
	 
	 WebElement search_vikram_movie = driver.findElement(By.xpath("//div[@class='sc-bNQFlB deuLNI']/div/div[2]/div/ul/li/div/div[2]/span/strong"));
	 search_vikram_movie.click();
	 
	 WebElement book_vikram_movie = driver.findElement(By.xpath("//div[@class='sc-qswwm9-8 jayiEd']/div/button/div/span"));
	 book_vikram_movie.click();
	 Thread.sleep(2000);
	 WebElement theater = driver.findElement(By.xpath("//div[@class='body showtimes-details-container ']/div[2]/div[2]/a"));
	theater .click();
	 Thread.sleep(2000);
	 WebElement accept_conditions = driver.findElement(By.xpath("//div[@class='__actions']/div/div[3]"));
	 accept_conditions.click();
	 
	// WebElement select_seats = driver.findElement(By.xpath("//div[@id='qty-sel-title-body']/div[3]/div/input[2]"));
	// select_seats.click();
	 
	 
	 
	 
	 
	 
}
}
