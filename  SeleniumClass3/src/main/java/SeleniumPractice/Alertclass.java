package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertclass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> wait = new WebDriverWait(driver , Duration.ofSeconds(200));
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("See a sample prompt")).click();
		Alert alert = driver.switchTo().alert();
		
		wait.until(ExpectedConditions.alertIsPresent());
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//driver.findElement(By.linkText("See a sample prompt")).click();

		//Wait for the alert to be displayed and store it in a variable
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		//Type your message
		alert.sendKeys("Selenium");

		//Press the OK button
		alert.accept();
		
		

	}

}
