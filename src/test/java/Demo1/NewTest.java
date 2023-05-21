package Demo1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void testRadio() {
	   WebElement radiobutton1=driver.findElement(By.xpath("//input[@name='cars' and @value='honda']"));
		radiobutton1.click();
		}
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		System.out.println("Login test called");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
