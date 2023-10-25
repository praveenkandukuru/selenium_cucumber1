package StepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.model.Config;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class StepsLogin extends Baseclass {
	
	@Before
	public void setup() throws IOException
	{
		prop= new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\prave\\Selenium_cucumber1\\browser.properties");
		prop.load(file);
		
		String browser=prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromepath"));
			driver=new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxpath"));
		
			driver=new FirefoxDriver();
			
		}
		logger=Logger.getLogger(StepsLogin.class);
		PropertyConfigurator.configure("Log4j.properties");
		driver.manage().window().maximize();
		
	}
	
@Given("user launch the browser")
public void user_launch_the_browser() {
	
	
	logger.info("----driver is launched and maximized-------");
	lPage=new LoginPage(driver);
   
}

@When("opens url {string}")
public void opens_url_https_admin_demo_nopcommerce_com_login(String url) {
	
    driver.get(url);
    logger.info("----website is opened-------");
}

@When("user enters Email as {string} and Password as {string}")
public void user_enters_Email_as_and_Password_as(String string, String string2) {
    lPage.setUserName(string);
    lPage.setPassword(string2);
    logger.info("----enter username and password-------");
}

@When("click on login button")
public void click_on_login_button() {
	

	lPage.click();
	logger.info("----clicked on login button-------");   
}

@Then("Page title should be {string}")
public void page_title_should_be(String title) {
	
	if(driver.getPageSource().contains("Login was unsuccesful.")) {
		driver.close();
		Assert.assertTrue(false);
	}else {
		Assert.assertEquals(title,driver.getTitle());
	}
	
	logger.info("----page title is validated-------");
}

@When("user click on the logout link")
public void user_click_on_the_logout_link() throws InterruptedException {
	lPage.clicklogout();
	logger.info("----clicked on logout-------");
	Thread.sleep(3000);
  
}


@Then("close browser")
public void close_browser() {
    driver.quit();
    logger.info("----browser is closed-------");
}


//adding customer------------

@Then("User can view DashBoard")
public void user_can_view_DashBoard() {
	
	acp=new AddCustomerPage(driver);
	String title=driver.getTitle();
	if(title.equals("Dashboard / nopCommerce administration"))
	{
		System.out.println("it a Dashboard page");
	}
	logger.info("----DashBoard page is opened and title of the page is verified-------");
}

@When("user click on the customer menu")
public void user_click_on_the_customer_menu() {
	
	acp.clickOnCustomerMenu();
	logger.info("-----clicked on the customers menu option-------");
}

@Then("click on the customers in the menu list")
public void click_on_the_customers_in_the_menu_list() {
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	acp.clickOnTheCustOpt();
	logger.info("----clicked on the customers option in the customer menu-------");
   
}

@Then("click on the Add new button")
public void click_on_the_Add_new_button() {
	
	acp.clickOnAddnew();
	logger.info("----clicked on the add new customer button-------");
   
}

@Then("Enter the customer information")
public void enter_the_customer_information() {
	String email=randomString()+"@gmail.com";	   
     acp.enterEmail(email);
     acp.enterFname("killer");
     acp.enterLname("pandey");
     acp.clickOnDob("09/09/2009");
     acp.clickOnCompany("piolax private limited");
     acp.clickonGender("Male");
     acp.clickOnCustomerRole();
     acp.selectCustomerType("admin");
     acp.selectVendorType("Vendor 1");
     logger.info("----all details of the customer is entered-------");
     
}

@Then("click on save button")
public void click_on_save_button() {
	acp.clickOnSaveButton();
	logger.info("----clicked on the save button-------");
   
}

@Then("user can view confirmation message {string}")
public void user_can_view_confirmation_message(String string) {
	String msg=acp.getMessage();
	if(msg.equals(string))
	{
		System.out.println("*******msg is displayed***********");
	}
	logger.info("========message is verified------------");
	
   
}

//*****************Search customer by name**************



@Then("enter first name and last name")
public void enter_first_name_and_last_name() {
	scp=new SearchCustomerPage(driver);
	scp.setFirstName("Killer");
	scp.setLastName("Pandey");
	
	
}

@Then("click on the search button")
public void click_on_the_search_button() {
	scp.clickOnSearchButton();
	}

   

@Then("name should be displayed in customers table")
public void name_should_be_displayed_in_customers_table() {
	String cname=scp.getUserName();
	System.out.println(cname);
	
    
}

@Then("validate the name")
public void validate_the_name() {
	String cname=scp.getUserName();
	String a[]=cname.split("");
	if(a[0].equals("Killer")&&(a[1].equals("Pandey")))
	{
		Assert.assertTrue(false);
	}
	
}

@Then("close the browser")
public void close_the_browser() {
	driver.quit();
  
}









}
