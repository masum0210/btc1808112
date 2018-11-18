Feature: Navigation facebook Validation

Scenario Outline: login Credentials

Given open Browser
And navigate to facebook URL
When user type "userid" on user ID on box
And user type "password" on password box
And user click on login button
Then user should be in profile page

Examples:
|userid|password| 
|user1|man123|
|user2|woman123|
