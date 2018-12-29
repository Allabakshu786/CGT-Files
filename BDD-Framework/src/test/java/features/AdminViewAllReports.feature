Feature: Admin can view different reports 

Scenario:
Admin can view differents types of reports of all students in grid format with respect to particular exam 

	Given Admin should be on Login Page of electus
	When title of login page is Electus Educare 
	Then Admin enters "Admin1" in username and "electsu999" in password fields 
	And Admin clicks on SignIn button 
	Then Admin is on Dashboard page 
	And Admin clicks on Reports icon 
	Then Admin is on Select exam to view reports page 
	When title of select exam page is Electus Educare 
	Then Admin select the particular exam in dropdown 
	And Admin clicks on Select Exam button 
	Then Admin is on view different types of reports page