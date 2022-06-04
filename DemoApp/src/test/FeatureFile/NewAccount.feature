Feature: New Account

Scenario: Varify the  Open a new Account page 
Given Launch the browser
When Navigate the URL
And User enters name as "john" and password as "demo"
And Click on the login
Then Page title should be "ParaBank | Accounts Overview"
And Click on the open new account link
Then Select the account type either checking or saving 
And Select the existing account number to trasnfer fund to new account 
Then Click on the open new account button 
When User Click on the Logout link
And Close the Browser