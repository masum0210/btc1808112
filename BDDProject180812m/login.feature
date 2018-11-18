Feature: Validate Login Creadential

Background: 
Given open Browser
And navigate to facebook URL

@Smoke
Scenario: Login to profile page with valid creadential 


When user type userId on user ID on box
And user type password on password box
And user click on login button
Then user should be in profile page

@Reggretion
Scenario: Login with invalid credential


When user type invalid on user ID on box
And user type invalid password on password box
And user click on login button
Then user should not be able to in profile page


@Intergration
Scenario: Verify login button is enable 


When user will check login button is enable or not
Then based on the result user should get return true or false 


