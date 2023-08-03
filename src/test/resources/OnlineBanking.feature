@Smoke  @Regression
Feature: Login function for Smarttech Online Banking
Description:



@Positive_Scenario  @TC_LP-18
Scenario: Login function with valid credential
Given open the Browser
And go to Application URL
When put valid username
And put valid password
And sign in
Then check signout button there or not


@Negative_Scenario @TC_LP-19

Scenario: Login function with invalid credential
Given open the browser
And go to Application URL
When put invalid username
And put invalid password
And click sign in
And accept Alert
Then signout button should not be visible
