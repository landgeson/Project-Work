package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
	    chromeOptions.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(chromeOptions);
		
	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		//page drop down
		Actions at = new Actions(driver);
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
	      
	      //checkbox
		
		WebElement Sports=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		Sports.click();
		WebElement Reading=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
		Reading.click();
		WebElement Music=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		Music.click();
		
		//uncheck
		Sports.click();
		Thread.sleep(2000);
		Reading.click();
		Thread.sleep(2000);
		Music.click();
		Thread.sleep(2000);
		
		
		
		//validation--->isDisplayed,isSelected,isEnabled
		
		Boolean bool1=Sports.isDisplayed();
		System.out.println(bool1);
		if(bool1=true) {
			Sports.click();
		}
		Boolean bool2=Reading.isSelected();
		System.out.println(bool2);
		if(bool2=false) {
			Reading.click();
		}
			Boolean bool3=Music.isEnabled();
			System.out.println(bool3);
			if(bool3=true) {
				Music.click();
				
				driver.quit();
		}
	}

}
