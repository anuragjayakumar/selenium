package com.seleinum.mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_task {
	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(2000);

		driver.navigate().back();
		WebElement forgotpass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotpass.click();
		Thread.sleep(2000);
		
		WebElement forgot_page_test = driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']"));
		String get2 = forgot_page_test.getText();
		System.out.println("forgot_title:"+ get2);
		
		 WebElement inside_email_text = driver.findElement(By.xpath("//input[contains(@placeholder,'number')]"));
        inside_email_text.sendKeys("anurag******gmail");
        
        WebElement forgot_account = driver.findElement(By.xpath("(//a[@role ='link'])[3]"));
        forgot_account.click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
