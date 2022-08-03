package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement email_Txt = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		email_Txt.sendKeys("arahk***gmail");

		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		password.sendKeys("hfjd");

		WebElement create_page = driver.findElement(By.xpath("//h2[contains(text(),'you connect')]"));
		String get = create_page.getText();
		System.out.println("page text :" + get);

		WebElement fb_page = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = fb_page.getText();
		System.out.println("page :" + text);

		WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();
		
		driver.quit();
		

	}

}
