Feature: Test me validation for the cart
@Sanity
Scenario: user cross check for adding item in the cart
Given Application launched by registered user for cart
Then user verifying add item
@Regression
Scenario: user cross check for removing item in the cart
Given Application launched by registered user for cart
Then user verifying remove item
@Sanity @Regression
Scenario: user cross check for max countin the cart
Given Application launched by registered user for cart
Then user verifies max count of items in the cart
#@Smoke @Regression
#Scenario: user cross check for max countin the cart
#Given Application launched by registered user for cart
#Then user verifies max count of items in the cart


#4 methods will be generated since 4,9,14 are same and the remaining 3 are created



