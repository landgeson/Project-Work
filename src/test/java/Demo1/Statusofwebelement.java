package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Statusofwebelement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://sbm.gov.in/SBM_DBT/Secure/DBT/DBT_Registration.aspx");
		
		//isDisplay //is Enabled
		
		//WebElement serachStore=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //System.out.println("Display Status:"+serachStore.isDisplayed()); //true
       // System.out.println("Enable Status:"+serachStore.isEnabled());    //true
        
        //isSelected ---radio button,checkbox,dropdown
        WebElement Male=driver.findElement(By.xpath("//input[@id='rbt_Gender_0']"));
        WebElement Female=driver.findElement(By.xpath("//input[@id='rbt_Gender_1']"));
        
       System.out.println("Selected Male:"+Male.isSelected());
       System.out.println("Selected Female:"+Female.isSelected());
       
       Male.click();//Select male
       System.out.println("Selected Male:"+Male.isSelected());
       System.out.println("Selected Female:"+Female.isSelected());
         
       
       Female.click(); //Select female
      
       System.out.println("Selected Male:"+Male.isSelected());
       System.out.println("Selected Female:"+Female.isSelected());
         
	}

}
