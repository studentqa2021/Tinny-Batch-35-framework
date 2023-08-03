package com.generic;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pageobject.model.OnlineBankingPage;
import com.util.BaseConfig;

public class OnlineBanking {

	public void getLogIn() throws Exception   {
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(BaseConfig.getConfig("URL"));
	//put username
	driver.findElement(OnlineBankingPage.username).click();
	driver.findElement(OnlineBankingPage.username).sendKeys(BaseConfig.getConfig("username"));
	//put password
	driver.findElement(OnlineBankingPage.password).click();
	driver.findElement(OnlineBankingPage.password).sendKeys(BaseConfig.getConfig("password"));
			
	//put final signin
	driver.findElement(OnlineBankingPage.finalsignin).click();
	
	//Assertion
	
		SoftAssert sf=new SoftAssert();
	sf.assertTrue(driver.findElement(OnlineBankingPage.logoutBtn).isDisplayed());
	System.out.println("Hello");
	
	sf.assertAll();
	}

	
	
	
}
