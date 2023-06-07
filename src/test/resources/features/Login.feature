Feature: Login Test


#Background: 
#Given the user is on login screen


Scenario: login success
Given User is on login screen
When User enters valid creds
Then User should see Home screen


Scenario: login invalid
Given User is on login screen
When User enters below credentials
		|UserName|Passwor|
		|chirra|1233333|
		|wqdswq|dwqdwqdwq|
Then User should see error screen

@smoke
Scenario Outline: login successsss
Given User is on login screen
When User enters UserName as <UserName> 
And User enters Password as <Password>
Then User should see Home screen
But User should not see login screen

Examples:
		|UserName|Password|
		|wqe111d|1wdqdw11|
		|dw111qd|dw111dwq|
		
		
		