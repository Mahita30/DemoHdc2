Feature: user validations on new TESTME applications


Scenario: user verification for the registration in TESTME
Given TESTME app is launched
And user accessing registration link in TESTME app
When user providing valid data for all the required fields
Then user verifying registration status


Scenario: user verification for the login process
Given TESTME  is launched and is accessible
Then user clicks on the login link available in the Homepage
And Provides the valid Credentials
Then User checks the login status


	