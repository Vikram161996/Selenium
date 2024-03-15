package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_testng {
	
	@Test
	public void softassert() {
		
		SoftAssert softassertion = new SoftAssert();
		System.out.println("Soft assert started");
		softassertion.assertEquals("test","test1");
		System.out.println("Soft Assert executed");
		//softassertion.assertAll(); To record the failure
		
		
		
	}
	@Test	
public void hardassert() {
		
		System.out.println("Hard assert started");
		Assert.assertTrue(false);
		System.out.println("Hard Assert executed");
		
		
	}


}
