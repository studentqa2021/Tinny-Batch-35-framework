package com.generic;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class Login2 {

	public void getLogin() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(BaseConfig.getConfig("URL"));
	driver.findElement(By.xpath("//*[@class='authorization-link'']")).click();
	driver.findElement(By.xpath("//*[@id='email']")).click();	
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(BaseConfig.getConfig("email"));	
	driver.findElement(By.xpath("//*[@id='pass']")).click();
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(BaseConfig.getConfig("password"));
	driver.findElement(By.xpath("//*[@class=action login primary']")).click();
	driver.quit();	
		
		
		
		
	}
		
	

	
	}


	
		
	
	
	
	
	
	

