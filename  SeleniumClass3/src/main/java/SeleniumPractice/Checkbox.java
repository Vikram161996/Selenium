package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement chck = driver.findElement(By.cssSelector("#isAgeSelected"));
		chck.click();
		System.out.println("After select :" + chck.isSelected());
		Thread.sleep(5000);
		chck.click();
		System.out.println("After unselect :" + chck.isSelected());
		
		

	}

}
