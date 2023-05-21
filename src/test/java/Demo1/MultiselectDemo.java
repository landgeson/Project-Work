package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		System.out.println("Login test called");
		//code to select individual value
	
		WebElement ddfruits=driver.findElement(By.id("multiple-select-example"));
		
		Select s1=new Select(ddfruits);
		//selectByVisibleText
		s1.selectByIndex(0);
		s1.selectByIndex(2);
		System.out.println(s1.getAllSelectedOptions().size());
		
		s1.deselectByIndex(2);
		System.out.println(s1.getAllSelectedOptions().size());
		System.out.println(s1.getFirstSelectedOption().getText());
		
	
	}


}
