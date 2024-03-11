package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	try {
		
	driver.get("www.google.com");
	driver.findElement(By.cssSelector("[name='q']")).sendKeys("WebElement");
	String att = driver.switchTo().activeElement().getAttribute("title");
	System.out.println(att);
	}
	finally 
	{
	driver.quit();
	}
	}
}

