package luma.ny.hooks;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.ny.basepage.ParentClass;
import luma.ny.elementspage.MasterPageFactory;


public class Hooks extends ParentClass {

	MasterPageFactory pf;
	
	@Before
	public void setUp() {
		
		initialization();
	
		pf= PageFactory.initElements(driver, MasterPageFactory.class);
		pf.getLogin();

	} 

	//@After
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
