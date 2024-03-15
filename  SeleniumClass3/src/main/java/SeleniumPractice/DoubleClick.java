package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("//button[contains(text(),'Click Me / Double Click Me!')]"));
		action.doubleClick(dc).click(dc).build().perform();
		action.doubleClick(dc).click(dc).contextClick().build().perform();
		

		
		
	}

}
