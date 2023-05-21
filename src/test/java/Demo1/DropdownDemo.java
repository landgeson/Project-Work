package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Options;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		System.out.println("Login test called");
		//code to select individual value
	/*	
		WebElement ddcars=driver.findElement(By.id("carselect"));
		
		Select s1=new Select(ddcars);
		//selectByVisibleText
		s1.selectByVisibleText("Benz");
		System.out.println("is selected");
		Thread.sleep(2000);
		//selectByIndex
		s1.selectByIndex(0);
		Thread.sleep(2000);
		//selectByValue
		s1.selectByValue("honda");*/
		
		//code to select items in dropdown one by one
		
		WebElement selectElem=driver.findElement(By.id("carselect"));
		for(WebElement option : selectElem.findElements(By.tagName("option"))) {
		option.click();
		Thread.sleep(2000);
		}
		driver.close();
		

	}

}
