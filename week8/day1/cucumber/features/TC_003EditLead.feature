Feature: EditLead functionality of Leaftaps Application

#Background:
#Given Open the broswer
#And Load the url 

@Sanity @Functional
Scenario Outline: EditLead for Valid data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed
When Click on crmsfa link
And Click Leads Link
And Click FindLeads Link
And Click PhoneTab
Given Enter the phoneNumber as <phoneNumber>
When Click on FindLeads Button
And Click on FirstLeadId
And Click on Edit button
Given Clear and Enter the companyName as <companyName>
When Click on CreateLead Button
Then ViewLeads should be displayed as <companyName>

Examples:
|phoneNumber|companyName|
|91|TestLeaf|
#|99|Qeagle|



