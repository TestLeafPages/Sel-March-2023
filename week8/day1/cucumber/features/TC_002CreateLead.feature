Feature: CreateLead functionality of Leaftaps Application

#Background:
#Given Open the broswer
#And Load the url 

@Smoke
Scenario Outline: CreateLead for Valid data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed
When Click on crmsfa link
And Click Leads Link
And Click CreateLead Link
Given Enter the companyName as <companyName>
And Enter the firstName as <firstName>
And Enter the lastName as <lastName>
When Click on CreateLead Button
Then ViewLeadsPage should be displayed as <companyName>

Examples:
|companyName|firstName|lastName|
|TestLeaf|Subraja|S|
#|Qeagle|Vidhya|R|



