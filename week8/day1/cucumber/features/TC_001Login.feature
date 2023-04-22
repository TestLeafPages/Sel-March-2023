Feature: Login functionality of Leaftaps Application

#Background:
#Given Open the broswer
#And Load the url 

@Smoke
Scenario: Login for Positive testcase
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

@Regression
Scenario: Login for invalid Credential
Given Enter the username as 'DemoCSR1'
And Enter the password as 'crmsfa'
When Click on Login button
But ErrorMessage should be displayed



