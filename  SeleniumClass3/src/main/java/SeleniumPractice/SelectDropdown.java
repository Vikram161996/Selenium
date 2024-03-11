package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement selectdrop = driver.findElement(By.name("my-select"));
		Select select = new Select(selectdrop);
		//select.selectByIndex(1);
		//select.selectByValue("3");
		select.selectByVisibleText("Two");
		Boolean s = selectdrop.isEnabled();
		System.out.println(s);
		//if (selectdrop.isEnabled()){
			//System.out.println("True");
		//}
		WebElement input_disabled = driver.findElement(By.name("my-disabled"));
		Boolean i = input_disabled.isEnabled();
		System.out.println("Input"+i);
		driver.findElement(By.id("my-check-2")).click();
		
		//for each to get the option list
		//for(WebElement option : OptionList)
		//{
		//	System.out.println(option.getText());
		//}
		
		driver.get("demoqa.com/select-menu");
		List <WebElement> optionList = select.getAllSelectedOptions();
		for(WebElement option : optionList)
		{
			System.out.println(option.getText());
		}

	}

}
