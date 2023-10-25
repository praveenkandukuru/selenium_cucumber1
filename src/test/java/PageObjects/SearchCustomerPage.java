package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.Baseclass;

public class SearchCustomerPage extends Baseclass {
	
	
	public SearchCustomerPage(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(ldriver,this);
		
	}
	
	By fnameele=By.id("SearchFirstName");
	By lnameele=By.id("SearchLastName");
	By searchbtn=By.id("search-customers");
	By customername=By.xpath("//table[@id='customers-grid']//tbody/tr/td[3]");
	
	public void setFirstName(String fname) {
		driver.findElement(fnameele).sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		driver.findElement(lnameele).sendKeys(lname);
	}
	public void clickOnSearchButton()
	{
		driver.findElement(searchbtn).click();
//		JavascriptExecutor jse= (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click();",searchbtn);
		}
	
	public String getUserName()
	{
		String name=driver.findElement(customername).getText();
		return name;
	}

	
}
