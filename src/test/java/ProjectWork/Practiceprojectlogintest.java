package ProjectWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practiceprojectlogintest {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		DatabaseConnectivity db=new DatabaseConnectivity();
		
		
		//launch browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Chromdiver 113\\chromedriver_win32 (1)\\chromedriver.exe");
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		 chromeOptions.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(chromeOptions);
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   
   //create a object of PracticProject
   
   PracticeProject loginpg= new PracticeProject(driver);
   
   //open url
   driver.get("https://www.amazon.in/");
   
   loginpg.clickhellobtn();
   loginpg.Sendemail();
   loginpg.clickcontinuebtn();
   loginpg.SendPass();
   loginpg.clickSinginbtn();
   loginpg.Sendkeys1();
   Thread.sleep(5000);
   loginpg.clickSearchBtn1();
   Thread.sleep(2000);
   loginpg.clickOnProduct1();
   Thread.sleep(10000);
   String price=driver.findElement(By.xpath("//span[normalize-space()='69,999']")).getText();
   Float floatVal = Float.valueOf(price.replaceAll(",", "")).floatValue();
   System.out.println("Float: "+floatVal);
   String emailId= "myEmail.com";
   loginpg.clickOnAddbtn();
   System.out.println("Product added to cart succesfully");
   db.insertData(emailId, driver.getTitle(), floatVal);
   System.out.println("database updated succesfully");
  System.out.println("test sussesfull");
  System.out.println("Page title is : " + driver.getTitle());
  
  Thread.sleep(7000);
  driver.quit();

	}

}
