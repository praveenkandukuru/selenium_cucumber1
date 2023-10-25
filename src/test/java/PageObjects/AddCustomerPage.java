package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import StepDefinitions.Baseclass;

public class AddCustomerPage  extends Baseclass{
	
	
	
	public AddCustomerPage(WebDriver cdriver)
	{
		driver=cdriver;
		PageFactory.initElements(driver,this);
	}

	
	By custMenu=By.xpath("//ul[contains(@class,'flex-column nav-legacy')]/li[4]");
	By custOpt=By.xpath("//ul[contains(@class,'nav-treeview')]//p[text()=' Customers']");
	By addnewbtn=By.xpath("//div[@class='float-right']//a");
	By email=By.id("Email");
	By pwd=By.id("Password");
	By fnname=By.id("FirstName");
	By lastname=By.id("LastName");	
	By GenderFemale=By.id("Gender_Female");	
	By GenderMale=By.id("Gender_Male");
	By dob=By.id("DateOfBirth");
	
	By companyName=By.id("Company");
	By custrole=By.xpath("(//div[contains(@class,'k-multiselect-wrap')])[1]");
	By customertype=By.xpath("//div[@id='SelectedCustomerRoleIds_listbox']");
	By custadmin=By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']//li[text()='Administrators']");
	By custForum_mode=By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']//li[text()='Forum Moderators']");
	By custguests=By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']//li[text()='Guests']");
	By custRegistered=By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']//li[text()='Registered']");
	By vendor=By.xpath("//select[@id='VendorId']");
	By vendortypeBy=By.xpath("//select[@id='VendorId']/option[1]");
	
	By savebtn=By.xpath("//button[@class='btn btn-primary'][1]");
	
	
	
	
	
	
	public void enterPwd(String password)
	{
		driver.findElement(pwd).sendKeys(password);;
	}
	
	public void clickOnCustomerMenu()
	{
		driverwait1(driver,By.xpath("//ul[contains(@class,'flex-column nav-legacy')]/li[4]"));
		driver.findElement(custMenu).click();
	}
	public void clickOnTheCustOpt()
	{
		driver.findElement(custOpt).click();
	}
	public void clickOnAddnew()
	{
		driver.findElement(addnewbtn).click();
	}
	public void enterEmail(String Email)
	{
		driver.findElement(email).sendKeys(Email);
	}
	public void enterFname(String fname)
	{
		driver.findElement(fnname).sendKeys(fname);
	}
	public void enterLname(String Lname)
	{
		driver.findElement(lastname).sendKeys(Lname);
	}
	public void clickonGender(String gender)
	{if(gender.equals("Male"))
	
		driver.findElement(GenderMale).click();
	else 
		driver.findElement(GenderFemale).click();
		
	}	
	
	public void clickOnDob(String date)
	{
		driver.findElement(dob).sendKeys(date);
	}
	public void clickOnCompany(String cname)
	{
		driver.findElement(companyName).sendKeys(cname);
	}
	public void clickOnCustomerRole()
	{
		driver.findElement(custrole).click();
	}
	public void selectCustomerType(String type)
	{
		WebElement listElement;
		
		if(type.equals("admin"))
		{
			listElement=driver.findElement(custadmin);
		}
		else if (type.equals("guest")) 
		{
			listElement=driver.findElement(custguests);
		}
			else if(type.equals("Registered"))	
			{
				listElement=driver.findElement(custRegistered);
			}
			else {
				
				listElement=driver.findElement(custForum_mode);
				}
		
		//listElement.click();
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",listElement);
		
			}
		

		public void selectVendorType(String type)
		{
			Select select=new Select(driver.findElement(vendor));
			select.selectByVisibleText(type);
			
		}
		public void clickOnSaveButton()
		{
			driver.findElement(savebtn).click();
		}

		public String getMessage() {
			
			String pagesource = driver.getPageSource();
			return pagesource;

		}
}
		
		
	
	
	
	

