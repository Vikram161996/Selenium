package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		//or 
		//driver.swithTo(0); as there are only one frame
		WebElement con=driver.findElement(By.id("tinymce"));
		con.clear();
		con.sendKeys("Selenium");
		driver.switchTo().defaultContent();
		WebElement pt=driver.findElement(By.partialLinkText("Elemental Selenium"));
		pt.click();
		
		

	}

}
