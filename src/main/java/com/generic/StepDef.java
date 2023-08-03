package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.pageobject.model.OnlineBankingPage;
import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	@Given ("open the Browser")
	
	public void opentheBrowser() {
		
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Given ("go to Application URL")
	
	public void gotoApplicationURL() throws Exception {
		driver.navigate().to(BaseConfig.getConfig("URL"));
		
	}
	
	
	
	@When ("put valid username")
	
	public void putvalidusername() throws Exception {
		
		driver.findElement(OnlineBankingPage.username).click();
		driver.findElement(OnlineBankingPage.username).sendKeys(BaseConfig.getConfig("username"));
		
		
	}
	

	
	
	@When  ("put valid password")
	
	public void putvalidpassword() throws Exception {
		driver.findElement(OnlineBankingPage.password).click();
		driver.findElement(OnlineBankingPage.password).sendKeys(BaseConfig.getConfig("password"));
				
		
		
	}
	@When  ("sign in")
	
	
	public void signin() {
		driver.findElement(OnlineBankingPage.finalsignin).click();
		
		
	}
	@Then ("check signout button there or not")
	
	public void checksignoutbuttonthereornot() {
		
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(driver.findElement(OnlineBankingPage.logoutBtn).isDisplayed());
		System.out.println("Hello");
		
		sf.assertAll();
		
		
		
	}
	
	@Given("open the browser")
	public void open_the_browser() {
		 driver =new ChromeDriver();
			driver.manage().window().maximize();
			
		
	  
	}
	
	
	
	@When ("put invalid username")
	
	public void putinvalidusername() throws Exception {
		
		driver.findElement(OnlineBankingPage.username).click();
		driver.findElement(OnlineBankingPage.username).sendKeys(BaseConfig.getConfig("invalid_username"));
		
		
		
	}
	@When("put invalid password")
	public void put_invalid_password() throws Exception {
		driver.findElement(OnlineBankingPage.password).click();
		driver.findElement(OnlineBankingPage.password).sendKeys(BaseConfig.getConfig("invalid_password"));
				
	   
	}

	
	
	
	
	
	
	
	
	@When ("click sign in")
	
	public void clicksignin() {
		driver.findElement(OnlineBankingPage.finalsignin).click();
		
		
	}
	
		
	
	@Then ("signout button should not be visible")
	
	public void signoutbuttonshouldnotbevisible() {
		
		
		
		
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(!driver.findElement(OnlineBankingPage.logoutBtn).isDisplayed());
		System.out.println("Hello");
		
		sf.assertAll();
		
		
		
		
		
	}
	@When("accept Alert")
	public void accept_alert() {
	   
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
		
	
		
			
		
	

				
	
		
	
	
	
	
	
	
	
		