Feature: Update_Info

Scenario: Update Information

Given Launch the browser
When Navigate the URL
And User enters name as "john" and password as "demo"
And Click on the login
Then Page title should be "ParaBank | Accounts Overview"
And User click on update_contact Info
Then Page title should be "ParaBank | Update Profile"
And User enter the update info Phoneno as "8884668293"
Then click on update profile
When Page title should be "ParaBank | Update Profile"
When User Click on the Logout link
And Close the Browser