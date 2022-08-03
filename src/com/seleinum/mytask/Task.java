package com.seleinum.mytask;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().deleteAllCookies();
		String title = driver.getTitle();
		System.out.println("title:"+ title);
		String url = driver.getCurrentUrl();
		System.out.println("url:"+ url);
		driver.navigate().to("https://www.facebook.com/");
		String title2 = driver.getTitle();
		System.out.println("title :"+title2);
		String naviurl = driver.getCurrentUrl();
		System.out.println("current url"+naviurl);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Dimension d = new Dimension(750,20000);
		driver.manage().window().setSize(d);
		driver.quit();
		
		
		
	}

}
