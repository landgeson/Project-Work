package ProjectWork;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PracticeProject {
       
	WebDriver driver;
     

		//constructor
		PracticeProject (WebDriver d)
		{
			driver = d;	
		}
		  By hellobtn=By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
		  By EmailSend=By.id("ap_email");
		  By continuebtn=By.id("continue");
		  By PassSend=By.id("ap_password");
		  By Singin=By.id("signInSubmit");
		  By Search=By.id("twotabsearchtextbox");
		  By SearchBtn=By.id("nav-search-submit-button");
		  By product=By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 14 (128 GB) - Blue']");
		 By addbtn=By.id("add-to-cart-button");
		 
		  
		  public void clickhellobtn() {
			  driver.findElement(hellobtn).click();
				
			}
		  public void Sendemail() {
			  driver.findElement(EmailSend).sendKeys("myEmail.com");
				}
		  public void clickcontinuebtn() {
			  
			  driver.findElement(continuebtn).click();
				
			}
		  public void SendPass() {
			  driver.findElement(PassSend).sendKeys("myPassoword");
				
			}
		  public void clickSinginbtn() {
			  driver.findElement(Singin).click();
				
			}
		
		 public void Sendkeys1() {
				driver.findElement(Search).sendKeys("iphone 14");
				
			}
       public   void clickSearchBtn1 () {
			
			driver.findElement(SearchBtn).click();
		}
       public void clickOnProduct1() {
			
    	   driver.findElement(product).click();
    	   
    	  System.out.println("click n product"); 
    	   
		}
       
       public void clickOnAddbtn() throws InterruptedException {
    	   Set<String> handles = driver.getWindowHandles();
    	    String currentHandle = driver.getWindowHandle();
    	    for (String handle : handles) {

    	     if (!handle .equals(currentHandle))
    	     {
    	         driver.switchTo().window(handle);
    	     }
    	   }
//    	   
 	
    	  driver.findElement(addbtn).click();
    	  
    	
    	   
    	   
   	}
       
	
	
	
	


	
	
       
   	}
	
	
	
	


		


		

		
  

