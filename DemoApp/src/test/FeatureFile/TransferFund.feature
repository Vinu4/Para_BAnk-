Feature: Transfer Fund Functionality

Scenario: Send Amount

Given Launch the browser
When Navigate the URL
And User enters name as "john" and password as "demo"
And Click on the login
Then Page title should be "ParaBank | Accounts Overview"
And Click on the Transfer Funds
Then Page title shouldbe "ParaBank | Transfer Funds"
And User Enter amount as "2000"
Then Select from as "14676"
And To Account as "13344"
And Click on Transfer
When User Click on the Logout link
And Close the Browser