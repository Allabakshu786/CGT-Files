Feature: Login FreeCRM 

Scenario Outline: Free CRM Login Scenario

	Given user is should be on Login Page 
	When title of login page is Free CRM 
	Then user enters "<uname>" and "<pword>" 
	Then user clicks on login button 
	Then user is on home page 
	Then Close the browser 
	
	Examples: 
		| uname | pword |
		| Allabakshu786  | Bakshu@405  |