package Demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utils {
	public static void capturedscreenshot(WebDriver driver,String filename) throws IOException {
		TakesScreenshot scrShot=(TakesScreenshot)driver;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile,new File("./Screenshots/" +filename +"" ));
		
	}

}
