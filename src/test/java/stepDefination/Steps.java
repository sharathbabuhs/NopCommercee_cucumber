package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LogInPage;

public class Steps {
	public WebDriver driver;
	public LogInPage lp;

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


}
