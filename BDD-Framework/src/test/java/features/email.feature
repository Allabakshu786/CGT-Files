Feature: Maven Demopage Login
To Login in Demopage we have to enter login details
Scenario: Register On Maven Demopage without email
Given I am on the Maven homepage
When enter blank details for Register
Then error email shown
Scenario: Register On Maven Demopage with valid email
Given I am on the Maven homepage
When enter details for Register
Then login details shown