package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
 By savebtn=By.name("save");
 
 //Action method
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
 public void SetCutmrrole(String role)
 {
	 if(!role.equals("Vendors"))
	 {
		 ldriver.findElement(By.xpath(" //div[@class='input-group-append input-group-required']//div[@role='listbox']"));
		 
	 }
	 ldriver.findElement(cstmrole).click();
 }
}
