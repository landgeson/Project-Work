package Demo1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handledropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement dropcountryEle=driver.findElement(By.id("input-country"));
		
		Select dropcountry=new Select(dropcountryEle);
		
		//dropcountry.selectByVisibleText("India");//country selected from text
		//dropcountry.selectByValue("47");//country entered by value available in the option in html
		//dropcountry.selectByIndex(33); //Country entered by Index value
		
		//selecting option from dropdown using method
		
		List<WebElement>alloption=dropcountry.getOptions();
		
		for(WebElement option:alloption){
			
			if(option.getText().equals("Aruba"))
			{
				option.click();
				break;
			}
					
		}
		

	}

}
