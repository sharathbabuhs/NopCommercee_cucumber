package stepDefination;


import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddCustomerPage;
import pageObjects.LogInPage;

public class Steps extends Baseclass {
	
	@Given("User Lunch Chrome browser")
	public void user_Lunch_Chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lp=new LogInPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();

	}

	@When("User enters Email as {string} and  pwd as {string}")
	public void user_enters_Email_as_and_pwd_as(String string, String string2) {
		lp.setusername(string);
		lp.setpassword(string2);

	}

	@When("click on Login")
	public void click_on_Login() throws InterruptedException {
		lp.loginbtn();
		Thread.sleep(3000);
	}

	@Then("page Title Should be {string}")
	public void page_Title_Should_be(String title) throws InterruptedException {

		if(driver.getPageSource().contains("Login was unsuccessful."))
		{
			driver.close();
			Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title,driver.getTitle());
			Thread.sleep(3000);
		}
	}

	@When("User click on log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.logoutbtn();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}
	//customer feature stepdefination

	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() throws InterruptedException{
		
		addcust=new AddCustomerPage(driver);
		Thread.sleep(3000);
	Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getPageTitle());
	}
	@When("User click on customer Menu")
	public void user_click_on_customer_Menu() throws InterruptedException {
		Thread.sleep(3000);
		addcust.Clickoncutmrmenu();
	}

	@When("click on customer menu item")
	public void click_on_customer_menu_item() throws InterruptedException {
		Thread.sleep(2000);
		addcust.Clickoncutmrmenuitem();
	}

	@When("click on new add new button") 
	public void click_on_new_add_new_button() throws InterruptedException {
		Thread.sleep(2000);
		addcust.Clickonaddnewbtn();
	}

	@Then("user can view  Add new customer page")
	public void user_can_view_Add_new_customer_page() throws InterruptedException {
		
		Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getPageTitle());
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
	String email= randmestringn()+"@gmail.com";
	addcust.Textemail(email);
	addcust.Textpswrd("test123");
	addcust.SetCutmrrole("Guset");
	Thread.sleep(2000);
	addcust.setManagervendor("Vendor 2");
	addcust.setGender("Male");
	addcust.setfname("Sharath");
	addcust.setlname("arpitha");
	addcust.setdob("10/06/1990");
	addcust.setcmpname("sjm");
	
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
	addcust.clickonsave();
	Thread.sleep(2000);
	}

	@Then("user can view configuration message {string}")
	public void user_can_view_configuration_message(String msg) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	}




}
