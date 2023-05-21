package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.snapdeal.com");
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		
		
		driver.navigate().back();  //snapdeal
		driver.navigate().forward();  //amazon
		
		driver.navigate().refresh();  //refresh

	}

}
