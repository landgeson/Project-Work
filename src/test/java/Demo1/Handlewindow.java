package Demo1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlewindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Actions at = new Actions(driver);
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
		String parentHandle= driver.getWindowHandle();
		System.out.println("Window Handle:"+parentHandle);
		
		driver.findElement(By.id("newTabsBtn")).click();
		Set<String> handles=driver.getWindowHandles();
		for (String handle1:handles) {
			System.out.println(handle1);
			
			
			if(!handle1.equals(parentHandle)) {
				
			driver.switchTo().window(handle1);	
			driver.findElement(By.id("alertBox")).click();
			Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			alert.accept();
			driver.close();
			}
		}
			
			for (String handle2:handles) {
				System.out.println(handle2);
				
				
				if(!handle2.equals(parentHandle)) {
					
				driver.switchTo().window(handle2);
			
		driver.findElement(By.id("firstName")).sendKeys("yadagiri");
		Thread.sleep(2000);
				}
			}
		
		
		driver.switchTo().window(parentHandle);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-5000)");
		driver.findElement(By.id("name")).sendKeys("reddy");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
