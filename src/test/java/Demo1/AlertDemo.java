package Demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//simple Alert
		/*driver.findElement(By.id("alertBox")).click();
	    Alert SimplAlert=driver.switchTo().alert();	
		System.out.println(SimplAlert.getText());
		Thread.sleep(2000);
		SimplAlert.accept();
		Thread.sleep(2000);
		driver.quit(); */
		
		//confirmationAlert
		
		/*driver.findElement(By.id("confirmBox")).click();
		Alert confirmAlert=driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit(); */ 
		
		//prompt demo
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Reddy");
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit(); 
	
		

	}

}
