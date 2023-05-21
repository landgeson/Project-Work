package Demo1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipaldopdown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
	//Select product=new Select(driver.findElement(By.xpath("//select[@id='first']")));
	//product.selectByVisibleText("Google");
	
	//Select animal=new Select(driver.findElement(By.xpath("//select[@id='animals']")));
	//animal.selectByVisibleText("Avatar");
		
		
		//2
		
		WebElement product=driver.findElement(By.xpath("//select[@id='first']"));
		selectOptionFromDropdown(product,"Yahoo");
		
		WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
		selectOptionFromDropdown(animal,"Baby Cat");
		
		
		
	}
	
	public static void selectOptionFromDropdown(WebElement ele,String value)
	
	{
		Select drp=new Select(ele);
	
		
     List<WebElement>alloption=drp.getOptions();
		
		for(WebElement option:alloption){
			
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
			
		}
	}


}
