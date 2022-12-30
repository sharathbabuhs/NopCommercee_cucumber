package stepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LogInPage;
import pageObjects.SearchCustomerPage;

public class Baseclass {
	public WebDriver driver;
	public LogInPage lp;
	public AddCustomerPage addcust;
	public SearchCustomerPage srccust;

	public static String  randmestring() {
		String generateString1= RandomStringUtils.randomAlphabetic(5);
		return (generateString1);
		
	}
}
