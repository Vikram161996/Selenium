package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		String pwin = driver.getWindowHandle();
		System.out.println(pwin);
		WebElement ntab = driver.findElement(By.xpath("//button[contains(text(),'new Tab')]"));
		ntab.click();
		System.out.println(driver.getTitle());
		Set<String> wh = driver.getWindowHandles();
		System.out.println("No of window handles"+wh.size());
		//String cwin="";
		for(String child:wh)
		{
			System.out.println("Window handle"+child);
			if(!child.equalsIgnoreCase(pwin))
			{
				//cwin = driver.getWindowHandle();
				driver.switchTo().window(child);
				System.out.println("Current window tile"+driver.getTitle());
				driver.findElement(By.xpath("//span[contains(text(),'Java')]")).click();
			    
			}
		}
		driver.switchTo().window(pwin);
		System.out.println("Parent window tile"+driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
		driver.manage().window().maximize();
		
	}

}
