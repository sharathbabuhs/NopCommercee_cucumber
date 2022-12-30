package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Waithelper;

public class SearchCustomerPage {
	public WebDriver ldriver;
	
	Waithelper whelper;
	
	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		whelper=new Waithelper(ldriver);
		
	}
	@FindBy(how = How.ID, using = "SearchEmail")
	WebElement txtEmail;
	@FindBy(how = How.ID, using = "SearchFirstName")
	WebElement srchfname;
	@FindBy(how = How.ID, using = "SearchLastName")
	WebElement srchlname;
	@FindBy(how = How.ID, using = "SearchMonthOfBirth")
	WebElement drpdomonth;
	@FindBy(how = How.ID, using = "SearchDayOfBirth")
	WebElement drpdoday;
	
	@FindBy(how = How.ID, using = "SearchCompany")
	WebElement txtcmpnyname;
	@FindBy(how = How.XPATH, using = "//div[@role='listbox']")
	WebElement txtcmstmerrole;
	@FindBy(how = How.XPATH, using = "//li[text()='Administrators']")
	WebElement admincmstmerrole;
	@FindBy(how = How.XPATH, using = "//li[text()='Forum Moderators']")
	WebElement forumcmstmerrole;
	@FindBy(how = How.XPATH, using = "//li[text()='Guests']")
	WebElement gustcmstmerrole;
	@FindBy(how = How.XPATH, using = "//li[text()='Vendors']")
	WebElement vendrcmstmerrole;
	@FindBy(how = How.ID, using = "search-customers")
	WebElement searchbtn;
	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']")
	WebElement table;
	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody/tr")
    List<WebElement> tablerow;
	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody/tr/td")
    List<WebElement> tableclm;
	
	public void setEmail(String email)
	{
		whelper.WaitForElement(txtEmail, 30);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setFirstname(String fstname)
	{
		whelper.WaitForElement(srchfname, 30);
		srchfname.clear();
		srchfname.sendKeys(fstname);
	}
	
	public void setlstname(String lstname)
	{
		whelper.WaitForElement(srchlname, 30);
		srchlname.clear();
		srchlname.sendKeys(lstname);
	}
	public void clickonSearch()
	{
		searchbtn.click();
		whelper.WaitForElement(srchlname, 30);
	}
	public int getnoofrows()
	{
		return (tablerow.size());
	}
	public int getnoofrclms()
	{
		return (tableclm.size());
	}
	
	public boolean searchcustmerByEmail(String email)
	{
		boolean flag = false;
		for(int i=1;i<=getnoofrows();i++)
		{
			String emailid=table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[2]")).getText();
		
		System.out.println(emailid);
		if(emailid.equals(email))
		{
			flag=true;
		}
		}
		return flag;
	}
	

}
