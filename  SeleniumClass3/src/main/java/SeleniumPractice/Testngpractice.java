package SeleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Testngpractice {
 
	WebDriver driver;
	@BeforeClass
	public void initialize()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	
	public void testcase1() throws InterruptedException
	{
		driver.get("https:\\demo.seleniumeasy.com/basic-checkbox-demo.html");
		//WebElement chck = driver.findElement(By.cssSelector("#isAgeSelected"));
	//	chck.click();
	//	System.out.println("After select :" + chck.isSelected());
	//	Assert.assertTrue(chck.isSelected());
		//Thread.sleep(5000);
		//chck.click();
		//System.out.println("After unselect :" + chck.isSelected());
		//Assert.assertTrue(chck.isSelected());
		String title = driver.getTitle();
		String expected = "Selenium Easy - Checkbox demo for automation using selenium";
		AssertJUnit.assertEquals(title, expected);
	}
	
@Test
	
	public void testcase2() throws InterruptedException
	{
		//driver.get("https:\\demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement chck = driver.findElement(By.cssSelector("#isAgeSelected"));
		chck.click();
		System.out.println("After select :" + chck.isSelected());
		AssertJUnit.assertTrue(chck.isSelected());
		Thread.sleep(5000);
		chck.click();
		System.out.println("After unselect :" + chck.isSelected());
		AssertJUnit.assertTrue(chck.isSelected());
	}
   @AfterClass
	public void close()
	{
		driver.quit();
	}
	}


