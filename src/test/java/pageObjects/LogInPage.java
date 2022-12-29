package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	WebDriver ldriver;
	
	public LogInPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpassw;

	@FindBy(xpath="//button[text()='Log in']")
	WebElement btnlogin;

	@FindBy(linkText="Logout")
	WebElement lnkLogout;
	
	public void setusername(String Email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(Email);
	}
	
	public void setpassword(String pwd)
	{
		txtpassw.clear();
		txtpassw.sendKeys(pwd);
		
	}
	
	public void loginbtn()
	{
		btnlogin.click();
	}
	
	public void logoutbtn() throws InterruptedException
	{
		lnkLogout.click();
		Thread.sleep(3000);
	}
}