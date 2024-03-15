package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("alert('testing')");
		WebElement ele = driver.findElement(By.partialLinkText("Terms & Conditions"));
		//js.executeScript("arguments[0].scrollIntoView()", ele);
		//js.executeScript("window.scrollBy(0,1000)");//particular height and width
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//To scroll the page till the height of the page
		js.executeScript("arguments[0].click()", ele);
		
		
		
		
	}

}
