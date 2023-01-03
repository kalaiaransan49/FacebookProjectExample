Feature: Login functionality of application
Scenario Outline: user Login with valid Credential in application
Given user launch the facebook application
When Enter the  valid "<username>" in Email field
And Enter the valid "<password>" in password field
Then Click on login button


Examples:
|username|password|
|jayapandiyan4034@gmail.com|jayapandiyan|
|8870879630|14091998|







