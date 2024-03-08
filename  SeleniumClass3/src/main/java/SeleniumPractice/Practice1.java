package SeleniumPractice;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
	public static void main(String[] args)
	{

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	WebElement textinput = driver.findElement(By.id("my-text-id"));
	textinput.sendKeys("Selenium");
	
	//driver.quit();
	
	}
	
}
