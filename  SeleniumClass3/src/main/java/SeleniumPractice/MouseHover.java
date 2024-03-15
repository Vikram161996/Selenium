package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouseOver.html");
		Actions action = new Actions(driver);
		WebElement red = driver.findElement(By.id("redbox"));
		String color = red.getCssValue("background-color");
		System.out.println(color);
		action.moveToElement(red).build().perform();
		color = red.getCssValue("background-color");
		System.out.println(color);
		

	}

}
