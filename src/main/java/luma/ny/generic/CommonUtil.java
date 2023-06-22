package luma.ny.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import luma.ny.basepage.ParentClass;

public class CommonUtil extends ParentClass{

	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
	
	
	public static void getAssertion(String actual, String expected) {
		Assert.assertEquals(actual, expected);
		System.out.println("My desired result : " + actual);
	}
	
	
	
}
