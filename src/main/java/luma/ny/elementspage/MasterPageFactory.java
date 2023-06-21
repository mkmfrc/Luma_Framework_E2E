package luma.ny.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.ny.basepage.ParentClass;
import luma.ny.generic.CommonUtil;

public class MasterPageFactory extends ParentClass {

	public MasterPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Sign In")
	@CacheLookup
	private WebElement clickSignInBTN;

	public WebElement getClickSignInBTN() {
		return clickSignInBTN;
	}
	
	@FindBy(xpath = "//*[@id= 'email']")
	@CacheLookup
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}
	@FindBy(xpath = "//*[@id= 'pass']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(id = "send2")
	@CacheLookup
	private WebElement clickSignIn;

	public WebElement getClickSignIn() {
		return clickSignIn;
	}
	
	public void getLogin(){
		CommonUtil.actionClick(getClickSignInBTN());
		getEnterEmail().sendKeys(prop.getProperty("UserName"));
		getEnterPassword().sendKeys(prop.getProperty("Password"));
		CommonUtil.actionClick(getClickSignIn());
	}
	
}
