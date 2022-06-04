Feature: Login Functionality

Scenario: Login with Valid credentails 

Given Launch the browser
When Navigate the URL
And User enters name as "john" and password as "demo"
And Click on the login
Then Page title should be "ParaBank | Accounts Overview"
When User Click on the Logout link
And Close the Browser

Scenario Outline: Login Data
Given Launch the browser
When Navigate the URL
And User enters name as "<username>" and password as "<Password>"
And Click on the login
Then User able to see an error as "<error>"
And Close the Browser

Examples:
	| username | Password | error |
	| JOHN | demo | The username and password could not be verified. |
	| john | DEMO | The username and password could not be verified. |
