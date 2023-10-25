package StepDefinitions;

import java.time.Duration;
import java.util.Properties;

import  org.apache.log4j.Logger;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;


public class Baseclass {

	public WebDriver driver;
	public LoginPage lPage;
	public AddCustomerPage acp;
	public SearchCustomerPage scp;
	public static Logger logger;
	public Properties prop;
	
	

	public static String randomString() {
		String emailString = RandomStringUtils.randomAlphanumeric(6);
		return emailString;
	}

	public static void driverwait(WebDriver driver, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public static void driverwait1(WebDriver driver, By ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(ele));

	}

}
