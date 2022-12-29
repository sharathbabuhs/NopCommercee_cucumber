package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver)
	{
		PageFactory.initElements(ldriver, this); 
	}
	By lnkcutmrmenu = By.xpath("//a[@href=\"#\"]//p[contains(text(),\"Customers\")]");
	By lnkcutmrItem = By.xpath("//a[@href=\"/Admin/Customer/List\" ]//p[text()=' Customers']");
	By lnkaddnewbtn = By.xpath("  //a[normalize-space()='Add new']");
	By txtemail = By.id("Email");
	By txtpwrd = By.id("Password");
	By fstname = By.id("FirstName");
	By lstname = By.id("LastName");
	By gendermale = By.id("Gender_Male");
	By genderfmale = By.id("Gender_Female");
	By DOB = By.id("Gender_Female");
	By cmpnyname = By.id("Company");
	By chekbox = By.id("IsTaxExempt");
	By newsletter = By.xpath("//div[@class='input-group-append']//div[@role='listbox']");
	By cstmrole = By.xpath(" //div[@class='input-group-append input-group-required']//div[@role='listbox']");
	By cstmroleoption=By.xpath("//li[contains(text(),'Test store 2')]");
	By cstmerroleoption1 =By.xpath("//li[contains(text(),'Registered')]");
	By cstmerroleoption2 =By.xpath("//li[contains(text(),'Vendors')]");
	By cstmerroleoption3 =By.xpath("//li[contains(text(),'Guests')]");
	By cstmerroleoption4 =By.xpath("//li[contains(text(),'Forum Moderators')]");
	By cstmerroleoption5 =By.xpath("//li[contains(text(),'Administrators')]");
	By cstmervendor =By.xpath("//*[@id=\"VendorId\"]");

	By savebtn=By.name("save");

	//Action method

	public String  getPageTitle() {

	return ldriver.getTitle();
	}
	
	
	public void Clickoncutmrmenu()
	{
		ldriver.findElement(lnkcutmrmenu).click();
	}
	public void Clickoncutmrmenuitem()
	{
		ldriver.findElement(lnkcutmrItem).click();
	}
	public void Clickonaddnewbtn()
	{
		ldriver.findElement(lnkaddnewbtn).click();
	}
	public void Textemail(String email)
	{
		ldriver.findElement(txtemail).sendKeys(email);
	}
	public void Textpswrd(String passwrd)
	{
		ldriver.findElement(txtpwrd).sendKeys(passwrd);
	}
	public void Textfname(String fn)
	{
		ldriver.findElement(fstname).sendKeys(fn);
	}
	public void Textlstname(String ln)
	{
		ldriver.findElement(lstname).sendKeys(ln);
	}
	public void SetCutmrrole(String role) throws InterruptedException
	{
		if(!role.equals("Vendors"))
		{
			ldriver.findElement(By.xpath(" //div[@class='input-group-append input-group-required']//div[@role='listbox']"));

		}
		ldriver.findElement(cstmrole).click();
		WebElement listitem;
		Thread.sleep(3000);
		if(role.equals("Administrators"))
		{
			listitem = ldriver.findElement(cstmerroleoption5);
		}else if(role.equals("Guests"))
		{
			listitem = ldriver.findElement(cstmerroleoption3);
		}
		else if(role.equals("Registered"))
		{
			listitem = ldriver.findElement(cstmerroleoption1);
		}
		else if(role.equals("Vendors"))
		{
			listitem = ldriver.findElement(cstmerroleoption2);
		}
		else 
		{
			listitem = ldriver.findElement(cstmerroleoption4);
		}
		listitem.click();

		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("argument[0].click();", listitem);

	}
	public void setManagervendor(String value)
	{
		Select drp = new Select(ldriver.findElement(cstmervendor));
		drp.deselectByValue(value);
	}

	public void setGender(String gender) {
		if(gender.equals("Make")) {
			ldriver.findElement(gendermale).click();
		}else {
			ldriver.findElement(genderfmale).click();
		}

	}
	public void setfname(String fname) {
		ldriver.findElement(fstname).sendKeys(fname);

	}
	public void setlname(String lname) {
		ldriver.findElement(lstname).sendKeys(lname);

	}
	public void setdob(String dob) {
		ldriver.findElement(DOB).sendKeys(dob);

	}
	public void setcmpname(String cmpnname) {
		ldriver.findElement(cmpnyname).sendKeys(cmpnname);

	}
	public void clickonsave() {
		ldriver.findElement(savebtn).click();

	}
}
