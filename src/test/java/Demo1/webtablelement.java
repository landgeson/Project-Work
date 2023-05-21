package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtablelement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		System.out.println("Login test called");
		/*
		rows and  columns
		html=th,tr,td,table
		th =   header
		tr =  rows
		td =  columns/cell */
		
		//step 1:Identify the rows and columns of table
		//Number of rows in table
		int row_count=driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println("Number of rows :" +row_count);
		//Number of columns in table
		int colm_count=driver.findElements(By.xpath("//table[@id='product']/tbody/tr[2]/td")).size();
		System.out.println("Number of columns :" +colm_count);
		String first_part="//table[@id='product']/tbody/tr[";
		String Second_part="]/td[";
		String Third_part="]";
		for(int i=2;i<=row_count;i++) {
//		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td[1]")).getText());
//		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td[2]")).getText());
//		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td[3]")).getText());
		for(int j=1;j<=colm_count;j++) {
			//System.out.print(driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td["+j+"]")).getText());
	System.out.print(driver.findElement(By.xpath(first_part+i+Second_part+j+Third_part)).getText());
			System.out.print("\u0009");
			}
		System.out.println("  ");
		}
		driver.close();
		
		
		

	}

}
