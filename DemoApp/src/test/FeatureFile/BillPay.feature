Feature: Bill_Pay

Scenario: BillPay

Given Launch the browser
When Navigate the URL
And User enters name as "john" and password as "demo"
And Click on the login
Then Page title should be "ParaBank | Accounts Overview"
And Click on Bill Pay
Then Page title should be "ParaBank | Bill Pay"
When User enter Enter Payeename as "Vinayak" and Address as "yallapurnaka" and City as "sirsi" and State as "Karnataka" and Zipcode as "581402" and Phoneno as "8722348326"
And User Enter Account as "13122"
Then User Enter CofirmAccount as "13122"
Then User Enter payAmount as "105" 
And User select the from Account as "13344"
And Click on send payment

When User Click on the Logout link
And Close the Browser


