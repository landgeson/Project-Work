package Demo1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTest {

	//private static byte[] screenshotBase64;

	public static void main(String[] args) throws IOException {
		
           WebDriverManager .edgedriver().setup();
           WebDriver driver=new EdgeDriver();
           driver.manage().window().maximize();
			driver.get("https:\\www.w3schools.com/");
			utils.capturedscreenshot(driver,"Img.jpg");
			
			driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
			
			utils.capturedscreenshot(driver,"Img1.png");
//			TakesScreenshot scrShot=(TakesScreenshot)driver;
//			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(SrcFile,new File("./Screenshots/Image1.png"));
//	    String screenshotBase64 = scrShot.getScreenshotAs(OutputType.BASE64);
//		      byte[]byteArr = Base64.getDecoder().decode(screenshotBase64);
//			 
//		      byte[]byteArr = scrShot.getScreenshotAs(OutputType.BYTES);;
//			 FileOutputStream fos=new FileOutputStream("./Screenshots/Image3.jpg");
//			 fos.write(byteArr);
//			 fos.close();
			driver.quit();
}
	

}
