package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Remove blur inside event listeners
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(5000);
		List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class,'_2VHNef')]"));
		System.out.println(items.size());
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		for(WebElement item:items)
		{
			if(item.getText().contains("iphone 13"))
			{
				item.click();
				System.out.println("Item clicked");
				break;
				
			}
			
			
		}

	}

}
