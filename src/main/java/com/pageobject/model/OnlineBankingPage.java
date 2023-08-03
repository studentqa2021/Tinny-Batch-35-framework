package com.pageobject.model;

import org.openqa.selenium.By;

public class OnlineBankingPage {
//POM= By()
//PF=@FindBy
public static By username=By.xpath("//*[@id='username']");
public static By password=By.xpath("//*[@type='password']");
public static By finalsignin =By.xpath("//*[@value='Login']");
public static By logoutBtn=By.xpath("//*[@id='logoutButton']");


}
