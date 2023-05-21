package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettextvsgetattribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement emailinput=driver.findElement(By.id("Email"));
		
		//emailinput.clear();
		//emailinput.sendKeys("adm89@gmail.com");
		
		//Capturing text from the input
		System.out.println("Result from getAttribute method:"+emailinput.getAttribute("Value"));
		
		System.out.println("Result from gettext method:"+emailinput.getText());
		
		
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(button.getAttribute("class"));
		System.out.println(button.getAttribute("type"));
		
		System.out.println(button.getText());
		
		String title=driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
		System.out.println(title);
	}

}
