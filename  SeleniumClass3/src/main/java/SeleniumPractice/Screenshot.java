package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        System.out.println(timestamp);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = "./Screesnhots/"+"testing"+".png";
        try {
        	FileUtils.copyFile(source, new File(destination));
        	System.out.println("Screenshot captured and saved to"+destination);
        }
        catch(IOException e)
        {
        	System.out.println("Failed to capture screenshot"+e.getMessage());
        }
		
	}

}
