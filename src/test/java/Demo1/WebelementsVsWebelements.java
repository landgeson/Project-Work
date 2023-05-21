package Demo1;



import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementsVsWebelements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		//Find element------>return a single element
		
		//1
		
		/*//WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       //searchbox.sendKeys("test"); 
       
       //2
       //WebElement ele=driver.findElement(By.xpath("//div[@id='navFooter']//a"));
      // System.out.println(ele.getText());
       
       WebElement searchbutton=driver.findElement(By.xpath("//input[@id='twotabsearchtexlogin']"));
	
		
		//Find element ---->return a multipal element
		
		//1
		List<WebElement>Links=driver.findElements(By.xpath("//div[@id='navFooter']//a"));
		System.out.println("Number of links:"+Links.size()); 
		
		//for(WebElement ele:Links);
		{
		//System.out.println(ele.getText()); */
		
	//2
		
		//List <WebElement> ele=driver.findElements(By.xpath("//a[@id='nav-logo-sprites']"));
		//System.out.println(ele.size());
		
		//3
		
		List<WebElement> elements=driver.findElements(By.xpath("//img [contains(title,'electrinics')]"));
	     System.out.println(elements.size()); //0
		
		
		
		
	}

}
