package com.seleinum.classs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Broken_link_image {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException   {
		System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Selenium_Anurag\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		  List<WebElement> all_the_link = driver.findElements(By.tagName("a"));
		  for (WebElement links : all_the_link) {
			  
			 String link = links.getAttribute("href");
			 if (link == null || link.isEmpty()) {
				 continue;
			 }
		  
			URL url = new URL(link);
			URLConnection connection = url.openConnection();
			HttpURLConnection http = (HttpURLConnection) connection;
			http.connect();
			int code = http.getResponseCode();
			  String message = http.getResponseMessage();
			  if (code >= 400) {
				  System.out.println("link:"+link + "code"+code+"message:"+message);
				
			}
			  http.disconnect();
			
		}
		
		
	}

}
