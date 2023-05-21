package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromedemo {
	
	  //open chrome with creating obj using ChromDriver and WebDriver
 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Documents\\Simplilarn\\chromedriver_win32\\chromedriver.exe");
    //ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		
		//open Amazon
		//driver.get("https://www.amazon.in");
		
		 //open chrome with creating obj using WebDriverManager
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//open Amazon
		driver.get("https://www.amazon.in");
		
		//get title of the webpage
		
		System.out.println("Title of the web page is:"+ driver.getTitle()); 
		
		//get url of current page
		System.out.println("Current url of the web page is:"+ driver.getCurrentUrl());
		//captur pagesource
		System.out.println(driver.getPageSource()); 
		
	}

}
