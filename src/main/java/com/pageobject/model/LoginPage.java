package com.pageobject.model;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class LoginPage {

	
public static	By signIn=By.xpath("//*[@class='authorization-link']");
public static	By email=By.xpath("//*[@id='email']");
public static	By passWord=By.xpath("//*[@id='pass']");
public static	By finalsignIn=By.xpath("//*[@class='action login primary']");
}
