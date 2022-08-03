package com.seleinum.classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_method2 {
	public static void main(String[] args) throws my_Exception {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("amnayagb");
        //getAttribute()
        String attribute = email.getAttribute("Name");
        System.out.println("email attribute name value:"+attribute);
        
        String input_data= email.getAttribute("Value");
        System.out.println("input:"+attribute);
        
        //getTagName()
          String tagname = email.getTagName();
        //getLocation
          System.out.println("location :"+email.getLocation());
        //getSize
          System.out.println("size :"+email.getSize());
        //getRec
          System.out.println("getrectangle:"+email.getRect());
       
        //getCssValue
          
          WebElement login = driver.findElement(By.name("login"));
           String font = login.getCssValue("font-size");
           System.out.println("font :"+ font);
          
          
}
}
