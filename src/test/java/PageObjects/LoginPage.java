package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement linklogout;
	
	public void setUserName(String uname)
	{
		email.clear();
		email.sendKeys(uname);
	}

	
	public void setPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public void click()
	{
		loginbutton.click();
	}
	
	
	public void clicklogout()
	{
		linklogout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
