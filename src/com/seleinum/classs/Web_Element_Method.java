package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Method {
	public static void main(String[] args) throws my_Exception {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		//isDisplayed
		boolean display = email.isDisplayed();
		System.out.println("email is displyed or not :"+display);
		//isEnable
		if (email.isEnabled()&&password.isEnabled()) {
		//sendKeys
			email.sendKeys("anaurafag");
			password.sendKeys("7576i");
			password.clear();
			password.sendKeys("779878");
			
		} else {
			throw new my_Exception("elements are not enable");

		}
		WebElement Fb_text = driver.findElement(By.xpath("//h2"));
		//getText
		 System.out.println("gettxt:"+ Fb_text.getText());
		 
		 WebElement create_button= driver.findElement(By.xpath("//a[text()='Create a Page']"));
		 //click
		 create_button.click();
		 WebElement sign_button= driver.findElement(By.xpath("//a[@tabindex='4']"));
		 //click
		 sign_button.click();
		 WebElement male_button= driver.findElement(By.xpath("//label[text()='Male']"));
		 //click
		 male_button.click();
		 
		 WebElement female_button= driver.findElement(By.xpath("//label[text()='Female']"));
		 //isSelect
		 boolean female = female_button.isSelected();
		System.out.println("female button is select or not:"+female);
		driver.close();
		driver.quit();
		
		 
	
		
	}
	
	
	

}
